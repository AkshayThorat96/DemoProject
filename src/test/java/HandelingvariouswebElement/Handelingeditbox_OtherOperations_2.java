package HandelingvariouswebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelingeditbox_OtherOperations_2 {			//use of xpath

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.name("username"));
		username.click();
		
		Thread.sleep(2000);
		username.sendKeys("Admin");
		
		Thread.sleep(2000);
		
		WebElement pass=driver.findElement(By.name("password"));
		pass.click();
		pass.sendKeys("admin123");
		Thread.sleep(2000);
	
//		WebElement login=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
//		login.click();
//		Thread.sleep(2000);
	
		
		WebElement login=driver.findElement(By.cssSelector("button[type='submit']"));
		login.click();
		Thread.sleep(2000);
	}

}
