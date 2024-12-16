package mouseRelated_And_OtherOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		
		WebElement slider1=driver.findElement(By.xpath("//span[@style='left: 100%;']"));
		WebElement slider2=driver.findElement(By.xpath("//span[@style='left: 54.902%;']"));
		WebElement slider3=driver.findElement(By.xpath("//span[@style='left: 23.5294%;']"));
		
		a.dragAndDropBy(slider1, -100, 0).build().perform();
		Thread.sleep(1000);
		a.dragAndDropBy(slider2, 90, 0).build().perform();
		Thread.sleep(1000);
		a.dragAndDropBy(slider3, 400, 0).build().perform();
		

	}

}
