package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		WebElement userNameTextfield = driver.findElement(By.id("username"));
		userNameTextfield.sendKeys("trainee");
		Thread.sleep(3000);
		userNameTextfield.clear();
		Thread.sleep(3000);
		userNameTextfield.sendKeys("admin");
		Thread.sleep(3000);
		driver.quit();

	}

}
