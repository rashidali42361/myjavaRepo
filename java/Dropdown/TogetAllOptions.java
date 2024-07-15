package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TogetAllOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoqa.com/select-menu");
	WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	Select select=new Select(dropDown1);
	List<WebElement> allOptions = select.getOptions();
	for( WebElement option:allOptions)
	{
		System.out.println(option.getText());
	}
	select.selectByVisibleText("Black");
	Thread.sleep(3000);
	select.selectByVisibleText("Yellow");
	Thread.sleep(3000);
	driver.quit();
	
	

	}

}
