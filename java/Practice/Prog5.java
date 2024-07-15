package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Prog5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/alerts");
		//Thread.sleep(Duration.ofSeconds(5));
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(Duration.ofSeconds(5));
		//Alert popups handled.
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.switchTo().alert().dismiss();
		//prompt popups
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.switchTo().activeElement().sendKeys("happy");
		
		
		
			

	}

}
