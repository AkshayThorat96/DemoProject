package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Play_Video {

	public static void main(String[] args)throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=IQJCrYeGEPE");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.xpath("//button[@aria-label='Play']"));
		
		e.click();

	}

}	
