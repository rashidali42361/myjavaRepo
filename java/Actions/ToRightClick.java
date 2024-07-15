package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement link= driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action=new Actions(driver);
		//action.moveToElement(link).contextClick().perform();
		action.contextClick(link).perform();
		

	}

}