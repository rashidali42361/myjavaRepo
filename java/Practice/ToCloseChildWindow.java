package Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToCloseChildWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		String parentWinId = driver.getWindowHandle();
		WebElement mobile = driver.findElement(By.linkText("Mobiles"));
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).perform();
		action.click(mobile).perform();
		action.keyUp(Keys.CONTROL).perform();
		action.release().perform();
		Set<String> allId = driver.getWindowHandles();
		for(String id:allId)
		{
			System.out.println(id);
			driver.switchTo().window(id);
			if(!parentWinId.equals(id))
			{
				Thread.sleep(9000);
				driver.close();
			}
		}
		

	}

}
