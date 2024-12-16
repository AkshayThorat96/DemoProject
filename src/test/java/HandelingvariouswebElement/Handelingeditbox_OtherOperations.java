package HandelingvariouswebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelingeditbox_OtherOperations {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement usr= driver.findElement(By.id("username"));
		usr.click();
		usr.sendKeys("Admin");
		//Thread.sleep(3000);
		
		WebElement pass= driver.findElement(By.id("password"));
		pass.click();
		pass.sendKeys("123");
		//Thread.sleep(3000);
		
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		
		
		
		
		

		

	}

}
