package HandelingvariouswebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Program {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
	//	driver.findElement(By.linkText("Forgot Your Password?"));		//no need to locate on webpage just capy the text and paste here		
		
		driver.findElement(By.partialLinkText("Use Custom Dom")).click();	//no need to locate on webpage just capy hal text and paste here
		

	}

}
