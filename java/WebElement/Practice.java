package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement userNameTextfield = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pwdTextfield = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		userNameTextfield.sendKeys("trainee");
		userNameTextfield.sendKeys(Keys.CONTROL,"a");
		userNameTextfield.sendKeys(Keys.CONTROL,"c");
		pwdTextfield.sendKeys(Keys.CONTROL,"v");
		pwdTextfield.sendKeys(Keys.LEFT_CONTROL);
		submitButton.click();
		String errorMessage = driver.findElement(By.xpath("//div[@id='error']")).getText();
		//Thread.sleep(2000);
		System.out.println(errorMessage);
		

	}

}
