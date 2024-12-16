package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement usern = driver.findElement(By.id("username"));
		usern.click();
		usern.sendKeys("raj");
		Thread.sleep(2000);
		
		WebElement passw= driver.findElement(By.id("password"));
		passw.click();
		passw.sendKeys("12345");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		Thread.sleep(2000);
		
		//driver.close();
		}

}
