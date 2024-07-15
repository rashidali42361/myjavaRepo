package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		WebElement kidLink = driver.findElement(By.linkText("Kids"));
		Actions action=new Actions(driver);
		Thread.sleep(4000);
		action.moveToElement(kidLink).perform();

	}

}
