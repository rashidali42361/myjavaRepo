package PracticePom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheTitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		LoginPage login= new LoginPage(driver);
		login.loginAction("student", "Password123");
		String title = driver.getTitle();
		if(title.contains("Logged In Successfully"))
		{
			System.out.println("Title verified successfully");
		}
		else
		{
			System.out.println("Title not verified");
		}
		LogoutPage logout=new LogoutPage(driver);
		logout.logoutAction();
		driver.close();

	}

}
