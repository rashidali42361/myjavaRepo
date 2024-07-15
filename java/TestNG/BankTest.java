package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BankTest {
	@BeforeTest
	public void loginIntoApplication()
	{
		System.out.println("Successfully Login...");
		
	}
	@Test(priority=1)
	public void searchTest()
	{
		System.out.println("Search the product on amazon....");
	}
	@Test(priority=2)
	public void addTocArtTest()
	{
		System.out.println("Add the product in to cart");
	}
	@Test(priority=3,groups="regression")
	public void placeOrderTest()
	{
		System.out.println("yes!Order place successfully....");
	}
	@AfterTest
	public void logoutFromApp()
	{
		System.out.println("Logout Successfully..........Thank you!");
	}
	@BeforeMethod
	public void connectedToDB()
	{
		System.out.println("Data Base Connected");
	}
	@AfterMethod
	public void disconnectToDB()
	{
		System.out.println("Data Base Disconnected");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class method executed");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class method executed");
	}
	
	

	

}
