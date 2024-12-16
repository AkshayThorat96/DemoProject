package Newng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo2 {
	
	@Test
	public void m1()
	{
		Assert.assertNotEquals("ramesh", "suresh");		//string (expected and actual)should not be same then test case will pass
	}

}
