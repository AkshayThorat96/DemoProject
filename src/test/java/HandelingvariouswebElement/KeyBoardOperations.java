package HandelingvariouswebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardOperations {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement usern=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		
		usern.sendKeys("Akshay Kumar");
		
		Thread.sleep(1000);
		
		usern.sendKeys(Keys.BACK_SPACE);
		usern.sendKeys(Keys.BACK_SPACE);
		usern.sendKeys(Keys.BACK_SPACE);
		usern.sendKeys(Keys.BACK_SPACE);
		
		usern.sendKeys(Keys.CONTROL+"a");
		usern.sendKeys(Keys.CONTROL+"c");
		
		pwd.sendKeys(Keys.CONTROL+"v");
		
		
		

	}

}
