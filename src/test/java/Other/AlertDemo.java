package Other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement alertbutton=driver.findElement(By.id("alertbtn"));
		alertbutton.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
	//	driver.switchTo().alert().dismiss();
	//	System.out.println(driver.switchTo().alert().getText());
		
//		String actual=driver.switchTo().alert().getText();
//		String expected="Hello , share this practice page and share your knowledge";
//		
//		System.out.println(actual);
//		System.out.println(expected);
//		
//		if(actual.equals(expected))
//		{
//			System.out.println("correct title");
//		}
//		else
//		{
//			System.out.println("wrong title");
//		}
	}

}
