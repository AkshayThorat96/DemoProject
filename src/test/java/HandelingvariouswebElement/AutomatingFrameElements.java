package HandelingvariouswebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Akshay");		//first approch
		//driver.findElement(By.name("mytext1")).sendKeys("Akshay");						//second approch
		
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Ram");
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.xpath("//input[@name='mytext1']"));
		ele.clear();
		ele.sendKeys("Srk");
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("aaliya");
		
		
		
		
		
		
	}

}
