package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	
	@Test(dataProvider="loginDataProvider")
	public void loginTest(String user_name,String password)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user_name);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}
	@DataProvider(name="loginDataProvider")
	public Object[][] login() throws IOException
	{
		FileInputStream fis=new FileInputStream("./testdata/Testdata.properties");
		Properties property=new Properties();
		property.load(fis);
		String url = property.getProperty("url");
		String username1 = property.getProperty("user_name1");
		String username2 = property.getProperty("user_name2");
		String username3 = property.getProperty("user_name3");
		String username4 = property.getProperty("user_name4");
		String password = property.getProperty("password");
		return new Object[][]
				{
				{username1,password},
				{username2,password},
				{username3,password},
				{username4,password}
			
				};
	}
	
	
	

}
