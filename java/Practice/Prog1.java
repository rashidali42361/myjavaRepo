package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		
		//afjfmpnbsabuek@dropmail.me
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://vwo.com/");
		String title = driver.getTitle();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(title));
		WebElement tryLink = driver.findElement(By.xpath("(//a[text()='Try VWO for Free'])[1]"));
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
		tryLink.click();
		WebElement emailTextField = driver.findElement(By.xpath("//input[@id='modal-v1-step1-email']"));
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='modal-913cu-gdpr-consent-checkbox']"));
		WebElement button = driver.findElement(By.xpath("//button[text()='Start Now']"));
		emailTextField.sendKeys("afjfmpnbsabuek@dropmail.me");
		checkbox.click();
		button.click();
		
		
		
	
	}

}
