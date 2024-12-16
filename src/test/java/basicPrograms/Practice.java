package basicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		String a="GOogle";
		
		String b=driver.getTitle();
		
		System.out.println(a.equals(b));
		
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("true title");
		}
		else
		{
			System.out.println("False title");
		}
		driver.close();
	}

}
