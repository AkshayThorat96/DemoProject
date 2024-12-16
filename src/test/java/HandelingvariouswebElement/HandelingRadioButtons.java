package HandelingvariouswebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingRadioButtons {			//session 6

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement r1=driver.findElement(By.xpath("//input[@value='radio1']"));		// line no 17 to 24 this code is for radio button 1			
		r1.click();
		
		System.out.println(r1.isDisplayed());
		System.out.println(r1.isSelected());
		System.out.println(r1.isEnabled());
	
		Thread.sleep(3000);
		
		
		WebElement r2=driver.findElement(By.xpath("//input[@value='radio2']"));		// line no 27 to 34 this code is for radio button 2
		r2.click();
		
		System.out.println(r1.isDisplayed());
		System.out.println(r1.isSelected());
		System.out.println(r1.isEnabled());
	
		Thread.sleep(3000);
		
		
		WebElement r3=driver.findElement(By.xpath("//input[@value='radio3']"));		// line no 37 to 44 this code is for radio button 3
		r3.click();
		
		System.out.println(r1.isDisplayed());
		System.out.println(r1.isSelected());
		System.out.println(r1.isEnabled());
		
		Thread.sleep(3000);
	
		
	//(line number 19 to 46 this is a first approch to perform click operation on radio button)
		
		
		List <WebElement> allradiobuttons=driver.findElements(By.xpath("//input[@name='radioButton']"));
		
		for(int i=0;i<allradiobuttons.size();i++)
		{
			allradiobuttons.get(i).click();
			Thread.sleep(3000);
		}	
		
		
	//(line number 48 to 54 this is an second approch to perform click operation on radio buttons at a time)
		
		
		
		
		WebElement radio1=driver.findElement(By.xpath("//label[@for='radio1']"));
		System.out.println(radio1.getText());
		
		WebElement radio2=driver.findElement(By.xpath("//label[@for='radio2']"));
		System.out.println(radio2.getText());
		
		WebElement radio3=driver.findElement(By.xpath("//label[@for='radio3']"));
		System.out.println(radio3.getText());
		
		
	
	//(line number 46 to 53 this code is use to fetch the text from website and print into the console one by one)
	
	
	}

}


