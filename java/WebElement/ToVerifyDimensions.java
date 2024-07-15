package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://demo.actitime.com/login.do");
		Dimension username = driver.findElement(By.id("username")).getSize();
		Dimension password = driver.findElement(By.name("pwd")).getSize();
		int usernameHeight = username.getHeight();
		int passwordHeight = password.getHeight();
		int usernameWidth = username.getWidth();
		int passwordWidth = password.getWidth();
		if(usernameHeight==passwordHeight && usernameWidth==passwordWidth)
		{
			System.out.println("Dimensions are verified");
		}
		else
		{
			System.out.println("Dimensions are not vrified");
		}
	

	}

}
