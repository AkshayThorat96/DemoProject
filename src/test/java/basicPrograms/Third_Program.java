package basicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third_Program {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		String actual_title="login | salesforce";
		String expected_title=driver.getTitle();
		
		System.out.println(actual_title.equalsIgnoreCase(expected_title));		//First approch 
		
		if(actual_title!=null&&actual_title.equalsIgnoreCase(expected_title))	//Second approch
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("Incorrect Title");
		}
		

		    


	}

}
