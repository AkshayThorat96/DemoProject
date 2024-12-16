package Newng;
																//session 21
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadingFile {
	
	@Test
	public void fileHandeling() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		String path="C:\\Users\\xyz\\OneDrive\\Desktop\\New\\image.png";	// double backslash is imp here otherwise error will occure
		WebElement BrowsButton=driver.findElement(By.id("input-4"));
		BrowsButton.sendKeys(path);
	
	}

}
