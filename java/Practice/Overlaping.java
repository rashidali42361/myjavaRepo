package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Overlaping {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement userNameTextfield = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]"));
		WebElement passwordTextfield = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		int userNameY = userNameTextfield.getLocation().getY();
		int passwordY = passwordTextfield.getLocation().getY();
		int usernameHight = userNameTextfield.getSize().getHeight(); 
		int y2 = userNameY+usernameHight;
		//System.out.println(userNameY);
		//System.out.println(passwordY);
		if(y2<passwordY)
		{
			System.out.println("Pass:element overlaping is verified");
		}
		else
		{
			System.out.println("Failed:element overlaping is not verified");
		}
		
		

	}

}
