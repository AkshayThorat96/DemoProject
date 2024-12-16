package Newng;

import org.testng.annotations.Test;

public class Demo2 {

	@Test(priority = 3)
	public void mycity()
	{
		System.out.println("pune");
	}
	
	@Test(priority = 2)
	public void city()
	{
		System.out.println("shivajinagar");
	}

	@Test(priority = 1)
	public void yourcity()
	{
		System.out.println("satara");
	}




}
