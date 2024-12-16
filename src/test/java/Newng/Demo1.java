package Newng;

import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void main()
	{
		System.out.println("hi");
	}
		
	@Test(enabled = false)
	public void m2()
	{
		System.out.println("pune....");
	}

}

