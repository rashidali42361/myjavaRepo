package TestNG;

import org.testng.annotations.Test;

import common.CommonDataSetup;

public class SuitTest extends CommonDataSetup {
	@Test(priority=1,groups="regression")
	public void atest1()
	{
		System.out.println("test 1 executed");
	}
	@Test(priority=2,groups= {"smoke","regression"})
	public void btest2()
	{
		System.out.println("test 2 executed");
	}
	@Test(priority=3,groups="smoke")
	public void btest3()
	{
		System.out.println("test 3 executed");
	}
	@Test(priority=4,groups="regression")
	public void btest4()
	{
		System.out.println("test 4 executed");
	}

}
