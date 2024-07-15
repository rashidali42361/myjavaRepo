package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// https://demoapp.skillrary.com/product.php?product=selenium-training.
		
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement plusSign = driver.findElement(By.xpath("//button[@id='add']"));
		Actions action=new Actions(driver);
		action.doubleClick(plusSign).perform();
		//Thread.sleep(3000);
		//driver.quit();
		

	}

}
