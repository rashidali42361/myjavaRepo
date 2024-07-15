package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
    @Test
	public void titleTest() throws InterruptedException
	{
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
		String expectedtext = "Search";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		System.out.println("verify the title...");
		Assert.assertEquals(actualtitle, expectedtitle,"Title verification got failed");
		String actualtext = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		System.out.println("Verify the text");
		Assert.assertEquals(expectedtext, actualtext,"Text verification got failed");
		Thread.sleep(3000);
		System.out.println("Close the browser window");
		driver.close();
	}
    @Test
    public void softTest() throws InterruptedException
    {
    	SoftAssert softAssert = new SoftAssert();
    	String expectedtitle = "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
		String expectedtext = "Search ";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		System.out.println("verify the title...");
		softAssert.assertEquals(actualtitle, expectedtitle,"Title verification got failed");
		String actualtext = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		System.out.println("Verify the text");
		softAssert.assertEquals(expectedtext, actualtext,"Text verification got failed");
		Thread.sleep(3000);
		System.out.println("Close the browser window");
		//softAssert.assertAll();
		driver.close();
    }
}
