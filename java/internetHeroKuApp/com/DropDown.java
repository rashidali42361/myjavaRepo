package internetHeroKuApp.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Dropdown']")).click();
		WebElement options = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select select=new Select(options);
		select.selectByVisibleText("Option 1");
		List<WebElement> allOptions = select.getOptions();
		for(WebElement s:allOptions)
		{
			System.out.println(s);
		}
		if(select.isMultiple())
		{
			System.out.println("Fail:Dropdown is single selected");
		}
		else
		{
			System.out.println("Pass:Drop down is single selected");
		}
        
		
		

	}

}
