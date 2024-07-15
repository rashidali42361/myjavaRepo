package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToCheckMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/select-menu");
		WebElement cars = driver.findElement(By.id("cars"));
		Select select=new Select(cars);
		List<WebElement> allCar = select.getOptions();
		
		if(select.isMultiple())
		{
			System.out.println("Pass:dropdown is multi selecte");
		}
		else
		{
			System.out.println("Fail:not multiselect");
		}
		for( WebElement option:allCar)
		{
			option.click();
			Thread.sleep(3000);
		}
	Thread.sleep(3000);
	select.deselectAll();
	Thread.sleep(3000);
	//driver.quit();
	

	}

}
