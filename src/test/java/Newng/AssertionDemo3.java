package Newng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo3 {
	
	@Test
	public void m1()
	{
		Assert.assertTrue(false);			//value inside a bracket should be true otherwise exception will occur
		Assert.assertFalse(true);			//value inside a bracket should be false otherwise exception will occur
		
		
	}

}
