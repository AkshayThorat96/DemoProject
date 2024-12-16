package HandelingvariouswebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_2 {			//automation session 5

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement usern=driver.findElement(By.cssSelector("input[name='username']"));
		usern.sendKeys("Admin");
		
		Thread.sleep(2000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("admin123");
		
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().to("https://login.salesforce.com/");
		Thread.sleep(3000);
		
		
		

		
		
		
		

	}

}
