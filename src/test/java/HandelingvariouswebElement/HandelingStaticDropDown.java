package HandelingvariouswebElement;
																
import org.openqa.selenium.By;					
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelingStaticDropDown {						//session 8

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement dropd=driver.findElement(By.xpath("//option[@value='option1']"));	//this is first approch to perform click operation on particular drop down		
		dropd.click();		
		
															//(this is second approch to perform click operation on particular drop down)						
//		Select s=new Select(dropd);							//(here select tag name is available in html dom so thats why we are using 'Select' class here.as well as we are using this 3 methods which is available in 'Select' class)
//		
//		s.selectByIndex(1);
//		
//		
//		s.selectByValue("option3");
//		
//		
//		s.selectByVisibleText("Option2");
//		

	}

}
