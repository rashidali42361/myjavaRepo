package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIsDisplay {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://github.com/signup?user_email=&source=form-home-signup");
		 WebElement textBox = driver.findElement(By.id("email"));
		 Thread.sleep(4000);
		 if(textBox.isDisplayed())
		 {
			 System.out.println("Pass:Text box display successfully");
			 driver.quit();
		 }
		 else
		 {
			 System.out.println("Fail:Text box is not display");
			 driver.quit();
		 }

	}

}
