package Newng;

import java.util.Iterator;								//session 21
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandelingNewWindow {
	
	@Test
	public void new_window() throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement button=driver.findElement(By.id("openwindow"));
		button.click();
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getWindowHandle());
//		System.out.println(driver.getWindowHandles());
		
		Set <String> obj=driver.getWindowHandles();
		Iterator<String> ref=obj.iterator();
		String p=ref.next();
		String c=ref.next();
		
		driver.switchTo().window(c);
	//  (shift the control to the next window)	
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement courses=driver.findElement(By.xpath("(//a[@href='https://www.udemy.com/user/testing-minds/'])[2]"));
		courses.click();
		
		
		
	}

}
