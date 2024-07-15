package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://demo.actitime.com/login.do");
		Point username = driver.findElement(By.id("username")).getLocation();
		Point password = driver.findElement(By.name("pwd")).getLocation();
		System.out.println(username);
		System.out.println(password);
		int usernameSartX = username.getX();
		int passwordStartX = password.getX();
		int usernameStartY = username.getY();
		int passwordStartY=password.getY();
		//To verify the allignment of element.
		if(usernameSartX==passwordStartX)
		{
			System.out.println("The elements allignment are verified");
		}
		else
		{
			System.out.println("The elements allignment are not verified");
		}
		
		
		
		

	}

}
