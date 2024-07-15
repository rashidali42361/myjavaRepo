package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Program1 {
	
	@Test
	public void creatCUstomerTest()
	{
		System.out.println("step 1");
		System.out.println("step 2");
		Assert.assertEquals("A", "A","The EXpected result got failed");
		System.out.println("step 3");
		System.out.println("step 4");
	}
	@Test
	public void modifyCustomerTest()
	{
		System.out.println("==========================");
		System.out.println("step 1");
		System.out.println("step 2");
		System.out.println("step 3");
	}
	
	
	
	
	
	
}