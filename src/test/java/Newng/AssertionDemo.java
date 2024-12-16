package Newng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertionDemo {
	
	@Test
	public void m1()
	{
		Assert.assertEquals("karina","katrina");	//here two strings should be equal (expected and actual) othervise it will throws the exception.
		System.out.println("test case pass");		//if (actual and expected) string not match then following code will not get excecute
	}												//here this sop statement will not print 

}
