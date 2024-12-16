package Newng;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test(dependsOnMethods = "enterUrl")			// dependsOnMethods - we write method name into that (dependsOnMethods) method. this method will always execute after this method. 
	public void enterCredentials()
	{
		System.out.println("code to enter the details");
	}

	@Test
	public void enterUrl()
	{
		System.out.println("code to enter url");
	}
}
