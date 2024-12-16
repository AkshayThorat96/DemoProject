package Newng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	@BeforeMethod
	public void login()
	{
		System.out.println("login functions");
	}
	
	@AfterMethod()
	public void add()
	{
		System.out.println("add to cart");
	}
	
	@BeforeClass
	public void payment()
	{
		System.out.println("My payment options ");
	}
	
	@AfterClass
	public void logout()
	{
		System.out.println("end");
	}
	
	@Test
	public void m2()
	{
		System.out.println("hi");
	}
	
	@Test
	public void m1()
	{
		System.out.println("Hello");
	}
	
	@BeforeTest
	public void car()
	{
		System.out.println("tata");
	}
	
	@AfterTest
	public void cycle()
	{
		System.out.println("cycleing");
	}
	
	@AfterSuite
	public void project()
	{
		System.out.println("my project");
	}
}
