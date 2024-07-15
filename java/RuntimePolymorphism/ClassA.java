package RuntimePolymorphism;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class ClassA {
	public static void test(WebDriver driver)
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		if(title.equals("Google"))
		{
			System.out.println("Pass:Title is verified");
		}
		else
		{
			System.out.println("Fail:Title is not verified");
		}
	}

}
