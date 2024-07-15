package TestngPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program1 {
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Login to tha application");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("Logout to the application");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("DB connected");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Disconnect to DB");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}

}
