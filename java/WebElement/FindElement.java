package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://demo.actitime.com/login.do");
            WebElement userNameTextField = driver.findElement(By.xpath("//input[@id='username']"));
            WebElement passwordTextField = driver.findElement(By.xpath("//input[@name='pwd']"));
            userNameTextField.sendKeys("trainee");
            Thread.sleep(3000);
            userNameTextField.sendKeys(Keys.CONTROL,"a");
            Thread.sleep(3000);
            userNameTextField.sendKeys(Keys.CONTROL,"c");
            Thread.sleep(3000);
            passwordTextField.sendKeys(Keys.CONTROL,"v");
            Thread.sleep(3000);
           WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
           WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
           checkBox.click();
           if(checkBox.isSelected())
           {
        	   loginButton.click();
        	   System.out.println("Login successfully");
        	   Thread.sleep(3000);
        	   driver.quit();
           }
           
            


	}

}
