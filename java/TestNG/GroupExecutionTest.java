package TestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupExecutionTest {
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
	@BeforeGroups(value="regression")
	public void beforeGroup()
	{
		System.out.println("Run this method before regression group");
	}
	@AfterGroups(value="regression")
	public void afterGroups()
	{
		System.out.println("run this method after regression group");
	}

}
