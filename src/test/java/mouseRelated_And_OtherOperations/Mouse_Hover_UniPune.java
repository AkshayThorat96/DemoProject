package mouseRelated_And_OtherOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_UniPune {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.unipune.ac.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement about=driver.findElement(By.id("stUI5_cnt"));
		WebElement academics=driver.findElement(By.id("stUI45_txt"));
		WebElement research=driver.findElement(By.id("stUI187_txt"));
		WebElement administration=driver.findElement(By.id("stUI197_txt"));
		WebElement bdo=driver.findElement(By.id("stUI220_txt"));
		WebElement students_corner=driver.findElement(By.id("stUI239_cnt"));
		WebElement usefull_links=driver.findElement(By.id("stUI263_txt"));
		WebElement e_learning=driver.findElement(By.id("stUI287_txt"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(about).build().perform();
		Thread.sleep(1000);
		a.moveToElement(academics).build().perform();
		Thread.sleep(1000);
		a.moveToElement(research).build().perform();
		Thread.sleep(1000);
		a.moveToElement(administration).build().perform();
		Thread.sleep(1000);
		a.moveToElement(bdo).build().perform();
		Thread.sleep(1000);
		a.moveToElement(students_corner).build().perform();
		Thread.sleep(1000);
		a.moveToElement(usefull_links).build().perform();
		Thread.sleep(1000);
		a.moveToElement(e_learning).build().perform();
		Thread.sleep(1000);
		
		WebElement audio=driver.findElement(By.xpath("//span[@id=\"stUI293_txt\"]"));
		Thread.sleep(1000);
		a.moveToElement(audio).click().build().perform();
		


	}

}
