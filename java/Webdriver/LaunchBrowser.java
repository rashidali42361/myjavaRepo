package Webdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		String id = driver.getWindowHandle();
		System.out.println("browser launch succesfully");
		System.out.println("**********Title**********");
		System.out.println(title);
		System.out.println("**********Id**************");
		System.out.println(id);
		
	}

}
