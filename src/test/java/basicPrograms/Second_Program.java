package basicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second_Program {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(4000);
		
		//driver.manage().window().minimize();
		
		System.out.println(driver.getTitle());
		
		String actual_title="Login | Salesforce";			// actual title
		String expected_title=driver.getTitle();			// expected title
		
		System.out.println(actual_title.equals(expected_title));
		

	}

}
