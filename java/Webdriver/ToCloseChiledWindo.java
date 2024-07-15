package Webdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseChiledWindo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		String parentId = driver.getWindowHandle();
		System.out.println("Parent window id:"+parentId);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allId = driver.getWindowHandles();
		for(String id:allId)
		{
			System.out.println(id);
			driver.switchTo().window(id);
			if(!parentId.equals(id))
			{
				Thread.sleep(3000);
				driver.close();
			}
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
