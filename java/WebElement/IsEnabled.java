package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://github.com/signup?user_email=&source=form-home-signup");
	driver.findElement(By.name("user[email]")).sendKeys("jippy263@gmail.com");
	WebElement button = driver.findElement(By.xpath("//button[@class='js-continue-button signup-continue-button form-control px-3 width-full width-sm-auto mt-4 mt-sm-0']"));
	
	Thread.sleep(3000);
	//button.click();
	if(button.isEnabled())
	{
		System.out.println("PASS:Enable successfully");
	}
	else
	{
		System.out.println("FAIL:Not enabled");
	}

	}

}
