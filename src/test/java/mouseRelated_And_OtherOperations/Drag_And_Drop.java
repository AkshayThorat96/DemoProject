package mouseRelated_And_OtherOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;								//session 11
import org.openqa.selenium.WebElement;							
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//1
		WebElement washington =driver.findElement(By.id("box3"));
		WebElement united_states=driver.findElement(By.id("box103"));
		
		Actions a=new Actions(driver);
		
		a.clickAndHold(washington).build().perform();
		a.dragAndDrop(washington, united_states).build().perform();
		a.release().build().perform();
		
		
		Thread.sleep(1000);
		
//2		
		WebElement Rome=driver.findElement(By.xpath("(//div[contains(text(), 'Rome')])[2]"));
		WebElement Italy=driver.findElement(By.id("box106"));
		
		a.clickAndHold(Rome).build().perform();
		a.dragAndDrop(Rome, Italy).build().perform();
		a.release().build().perform();
		
		
		Thread.sleep(1000);
		
//3		
		WebElement Oslo=driver.findElement(By.xpath("(//div[contains(text(), 'Oslo')])[2]"));
		WebElement Norway=driver.findElement(By.id("box101"));
		
		a.clickAndHold(Oslo).build().perform();
		a.dragAndDrop(Oslo, Norway).build().perform();
		a.release().build().perform();
		
		
		Thread.sleep(1000);
		
//4
		WebElement Stockholm=driver.findElement(By.id("box2"));
		WebElement Sweden=driver.findElement(By.xpath("//div[contains(text(), 'Sweden')]"));
		
		a.clickAndHold(Stockholm).build().perform();
		a.dragAndDrop(Stockholm, Sweden).build().perform();
		a.release().build().perform();
		
		
		Thread.sleep(1000);
		
//5
		
		WebElement Copenhagen=driver.findElement(By.id("box4"));
		WebElement Denmark=driver.findElement(By.xpath("//div[contains(text(), 'Denmark')]"));
		
		a.clickAndHold(Copenhagen).build().perform();
		a.dragAndDrop(Copenhagen, Denmark).build().perform();
		a.release().build().perform();
		
	
		Thread.sleep(1000);
//6
		
		WebElement Madrid=driver.findElement(By.id("box7"));
		WebElement Spain=driver.findElement(By.id("box107"));
		
		a.clickAndHold(Madrid).dragAndDrop(Madrid, Spain).release().build().perform();
		
		Thread.sleep(1000);
		
		
//7
		
		WebElement Seoul=driver.findElement(By.xpath("(//div[contains(text(), 'Seoul')])[2]"));
		WebElement South_Korea=driver.findElement(By.xpath("//div[contains(text(), 'South Korea')]"));
		
		a.clickAndHold(Seoul).dragAndDrop(Seoul, South_Korea).release().build().perform();
			
	}

}

