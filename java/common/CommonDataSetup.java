package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {
	@BeforeSuite
	public void setupCommonData()
	{
		System.out.println("setup common data");
	}
	@AfterSuite
	public void dataTearDown()
	{
		System.out.println("Data have been cleaned");
	}

}
