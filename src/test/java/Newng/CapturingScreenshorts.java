package Newng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CapturingScreenshorts {
	
	@Test
	public void screenshort() throws InterruptedException, IOException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\xyz\\OneDrive\\Desktop\\NewScren\\image.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshort captured");
		
	}

}
