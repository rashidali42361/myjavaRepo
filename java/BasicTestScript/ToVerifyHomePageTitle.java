package BasicTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyHomePageTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		LoginPage login=new LoginPage(driver);
		login.loginAction("trainee", "trainee");
		HomePage homepage=new HomePage(driver);
		String actualTitle = homepage.homePageTitle();
		if(actualTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Pass:The title is verified");
		}
		else
		{
			System.out.println("Fail:The title is not Verified");
		}
		Thread.sleep(3000);
		//homepage.addNewCustomer();
		homepage.logoutAction();
		Thread.sleep(3000);
		driver.quit();
		
				

	}

}
