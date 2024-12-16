package Newng;

import org.testng.annotations.Test;

public class Demo3 {
	
	@Test(priority = 'a')
	public void openbrowser()
	{
		System.out.println("open new browser");
	}
	
	@Test(priority = 'b')
	public void closebrowser()
	{
		System.out.println("close new browser");
	}

}
