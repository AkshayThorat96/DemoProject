package Newng;

import org.testng.annotations.Test;				//session 17

public class GroupingDemo {

	@Test(groups = "smoke")
	public void m1()
	{
		System.out.println("m1");
	}
	
	@Test(groups = "smoke")
	public void m2()
	{
		System.out.println("m2");
	}
	
	@Test(groups = "regression")
	public void m3()
	{
		System.out.println("m3");
	}
}
