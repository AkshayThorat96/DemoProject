package mouseRelated_And_OtherOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;								//session 11
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement button=driver.findElement(By.id("mousehover"));			//we are locating a web element
		
		Actions a = new Actions(driver);						//create actions class
		
		a.moveToElement(button).build().perform();
			
	}
}
												/*to perform mouse hover opearation do following things
												 
													1) locate the element
													2) create a object for action class
													3) call the method	
														a.moveToElement().build().perform();
												*/
	
									