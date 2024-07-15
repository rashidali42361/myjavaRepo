package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/select-menu");
		WebElement car = driver.findElement(By.id("oldSelectMenu"));
		Select select=new Select(car);
		List<WebElement> allOption = select.getOptions();
		for(WebElement x:allOption)
		{
			System.out.println(x.getText());
		}
		System.out.println(select.isMultiple());
		
		

	}

}
