package TestngListener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestngListener.Listeners.class)
public class Report {
	
	@Test
	public void test_Success()
	{
		System.out.println("This is my success scanerio test");
	}
	@Test
	public void test_Failure()
	{
		System.out.println("This is my failure scanerio Test");
		Assert.assertTrue(false);
	}
	@Test
	public void test_Skip()
	{
		System.out.println("This is my skip scanerio test");
		throw new SkipException("This test is skipped");
	}

}
