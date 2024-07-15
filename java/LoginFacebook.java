import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzExOTU2MjQ3LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
        WebElement emailTextfield = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement passwordTextfield = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		emailTextfield.sendKeys("xyz233@gmail.com");
		passwordTextfield.sendKeys("276772877");
		loginButton.click();
		
		
		
	}

}
