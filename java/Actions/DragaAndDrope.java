package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragaAndDrope {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		WebElement img1 = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement img2 = driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
		WebElement img3 = driver.findElement(By.xpath("//img[@src='images/high_tatras3_min.jpg']"));
		WebElement img4 = driver.findElement(By.xpath("//img[@src='images/high_tatras4_min.jpg']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(img1, destination).perform();
		action.pause(3000);
		action.dragAndDrop(img1, destination).perform();
		action.pause(3000);
		action.dragAndDrop(img2, destination).perform();
		action.pause(3000);
		action.dragAndDrop(img3, destination).perform();
		action.pause(3000);
		action.dragAndDrop(img4, destination).perform();
		action.pause(3000);
		action.release().perform();
		driver.quit();
		
		


	}

}
