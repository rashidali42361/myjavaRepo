package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchDataInSourceDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file=new FileInputStream("./testdata/propertyData2.properties");
		Properties property=new Properties();
		property.load(file);
		String url = property.getProperty("url");
		String username = property.getProperty("userName");
		String password = property.getProperty("password");
		System.out.println(username);
		System.out.println(password);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		WebElement userNameTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		userNameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		passwordTextField.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//driver.quit();
		
		

	}

}
