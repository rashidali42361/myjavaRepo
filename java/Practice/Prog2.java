package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("FirstName")).sendKeys("asif");
		driver.findElement(By.id("LastName")).sendKeys("sek");
		driver.findElement(By.id("Company")).sendKeys("picasa");
		driver.findElement(By.id("Email")).sendKeys("Email");
		driver.findElement(By.id("confirm-button")).click();
		String actualText = driver.findElement(By.xpath("//span[@class='tooltip__message']")).getText();
		String expectedText = "Email Address\" field must be a valid email address";
		if(actualText.contains(expectedText))
		{
			System.out.println("Pass:The error message verified");
		}
		else
		{
			System.out.println("Fail:The error message not verified");
		}

		
		
		
		
		
		
		

	}

}
