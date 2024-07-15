package Pomrepo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyLoginPageTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		LoginPage login=new LoginPage(driver);
		login.loginAction("student","Password123");
		String actualTitle = driver.getTitle();
		if(actualTitle.contains("Logged In Successfully"))
		{
			System.out.println("Pass:The Title Verified");
		}
		else
		{
			System.out.println("Fall:The Title did not verify");
		}
		LogoutPage logout=new LogoutPage(driver);
		logout.logoutAction();
		Thread.sleep(Duration.ofSeconds(5));
		driver.quit();

		

	}

}
