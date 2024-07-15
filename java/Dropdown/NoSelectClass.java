package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NoSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/select-menu");
		WebElement dropDown = driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));
		Actions action=new Actions(driver);
		//action.sendKeys(Keys.PAGE_DOWN).perform();
		//action.sendKeys(Keys.PAGE_DOWN).perform();
		action.sendKeys(dropDown, "Group 2, option 1").sendKeys(Keys.ENTER).perform();
		action.pause(Duration.ofSeconds(15));
		//driver.quit();
		
		
	}

}
