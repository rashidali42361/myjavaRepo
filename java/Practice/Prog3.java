package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		 driver.switchTo().frame(frame);
		 WebElement image = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		 WebElement destination = driver.findElement(By.xpath("//div[@id='trash']"));
		 Actions action=new Actions(driver);
		 action.dragAndDrop(image, destination).perform();
		 
		
		
		 
	}

}
