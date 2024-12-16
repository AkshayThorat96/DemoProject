package HandelingvariouswebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	
		WebElement che1=driver.findElement(By.id("checkBoxOption1"));			//(line number 18 to 25 this code is for check box 1)
		System.out.println(che1.isDisplayed());
		che1.click();
		
		System.out.println(che1.isDisplayed());
		System.out.println(che1.isEnabled());
		System.out.println(che1.isSelected());
		Thread.sleep(2000);
		
		
		
		System.out.println("\n");
		
		
		WebElement che2=driver.findElement(By.id("checkBoxOption2"));			//(line number 32 to 39 this code is for check box 2)
		System.out.println(che2.isDisplayed());
		che2.click();
		
		System.out.println(che2.isDisplayed());
		System.out.println(che2.isEnabled());
		System.out.println(che2.isSelected());
		Thread.sleep(2000);
		
		
		System.out.println("\n");
		
		
		
		WebElement che3=driver.findElement(By.id("checkBoxOption3"));			//(line number 46 to 52 this code is for check box 3)
		System.out.println(che3.isDisplayed());
		che3.click();
		
		System.out.println(che3.isDisplayed());
		System.out.println(che3.isEnabled());
		System.out.println(che3.isSelected());
		
	}
}
