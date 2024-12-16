package HandelingvariouswebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		

		WebElement autodr=driver.findElement(By.xpath("//input[@id='autosuggest']"));
		autodr.sendKeys("ind");
		Thread.sleep(1000);
		
//		autodr.sendKeys(Keys.ARROW_DOWN);				//(line no 23 to 27 first approch )
//		
//		autodr.sendKeys(Keys.ARROW_DOWN);
//		
//		autodr.sendKeys(Keys.ENTER);
		
		List <WebElement> list= driver.findElements(By.xpath("//Li[@class='ui-menu-item']"));		//(second approch 31-39)

		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equals("India"));
			{
				list.get(i).click();
			}
		}
	}

}
