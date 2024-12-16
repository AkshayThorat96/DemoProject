package Newng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CapturingScreenshort1 {
	
	@Test
	public void image() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1721393199309']"));
		
		TakesScreenshot ts=(TakesScreenshot)driver.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1721393199309']"));
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\xyz\\OneDrive\\Desktop\\New\\image.png");
		FileUtils.copyFile(source, destination);
		
		System.out.println("screenshort captured");
		
	}

}
