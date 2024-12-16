package mouseRelated_And_OtherOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Practice {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		WebElement a=driver.findElement(By.id("draggable"));
		WebElement b=driver.findElement(By.id("droppable"));
		
		Thread.sleep(2000);
		
		Actions x=new Actions(driver);
		
		x.clickAndHold(a).build().perform();
	//	Thread.sleep(2000);
		x.dragAndDrop(a, b).build().perform();
	//	Thread.sleep(2000);
		x.release().build().perform();
		
	}

}