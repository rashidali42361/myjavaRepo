package WebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllSuggestions {

	private static Object object;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("chat");
		Thread.sleep(3000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		System.out.println(allLinks.size());
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
			if(link.getText().equals("chatgpt login"))
			{
				link.click();
				break;
				
			}
		}

	}

}
