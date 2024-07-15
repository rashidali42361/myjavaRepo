package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	@Test
	public void createStudentTest()
	{
		System.out.println("Step 1");
		System.out.println("step 2");
		SoftAssert s=new SoftAssert();
		s.assertEquals("A","B");
		System.out.println("Step 3");
		s.assertEquals("X","Y");
		System.out.println("step 4");
		s.assertAll();
	}
	@Test
	public void modifyTest()
	{
		System.out.println("=============================");
		System.out.println("step 1");
		System.out.println("step 2");
		System.out.println("step 3");
	}

}
