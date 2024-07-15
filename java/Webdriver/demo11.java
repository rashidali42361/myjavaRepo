package Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo11 {

	public static void main(String[] args) throws InterruptedException {
		//To close the chiled wind.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		Actions action=new Actions(driver);
		Thread.sleep(Duration.ofSeconds(5));
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(Duration.ofSeconds(5));
		action.sendKeys(Keys.PAGE_DOWN).perform();
		action.release().perform();
		driver.findElement(By.linkText(" Pricing ")).click();
		Thread.sleep(Duration.ofSeconds(5));
		String cId = driver.getWindowHandle();
		if(parentId.equals(cId)) {
			System.out.println("succesfull");
		}
		else
		{
			System.out.println("unsuccessfull");
		}
			   
	}
}
