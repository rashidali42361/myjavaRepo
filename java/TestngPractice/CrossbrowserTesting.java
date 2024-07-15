package TestngPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserTesting {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifyTitle(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("https://www.aajtak.in");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
	
	

}
