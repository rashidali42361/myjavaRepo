package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("FirstName")).sendKeys("asif");
		driver.findElement(By.id("LastName")).sendKeys("sek");
		driver.findElement(By.id("Company")).sendKeys("picasa");
		driver.findElement(By.id("Email")).sendKeys("dj02pjsd@flymail.tk");
		driver.findElement(By.id("confirm-button")).click();

	}

}
