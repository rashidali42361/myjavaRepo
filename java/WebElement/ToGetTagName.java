package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://demo.actitime.com/login.do");
		 String tagName = driver.findElement(By.xpath("//div[text()='Login ']")).getTagName();
		 Point location = driver.findElement(By.xpath("//div[text()='Login ']")).getLocation();
		 System.out.println(tagName);
		 System.out.println(location);
		int x = location.getX();

           int y = location.getY();
           System.out.println(x);
           System.out.println(y);
		 driver.quit();

	}

}
