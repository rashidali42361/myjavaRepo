package TestNG;

import org.testng.annotations.Test;

public class Program2 {
	@Test(priority=1)
	public void test1()
	{
		System.out.println("Test1 executed");
	}
	@Test(priority=5)
	public void test2()
	{
		System.out.println("Test2 executed");
	}
	@Test(priority=2)
	public void test3()
	{
		System.out.println("Test3 executed");
	}
	@Test(priority=3)
	public void test4()
	{
		System.out.println("Test4 executed");
	}

}
