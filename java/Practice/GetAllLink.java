package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLink {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://artoftesting.com/get-all-links-in-a-webpage-selenium-webdriver-java");
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		int count=0;
		for(WebElement link:allLink)
		{
			System.out.println(link.getText());
			count++;
		}
		System.out.println(count);

	}

}
