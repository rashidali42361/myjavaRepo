package internetHeroKuApp.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAndDelete {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://the-internet.herokuapp.com/");
	WebElement addAndRemoveLink = driver.findElement(By.xpath("//a[text()='Add/Remove Elements']"));
	addAndRemoveLink.click();
	Thread.sleep(3000);
	WebElement addButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
	addButton.click();
	Thread.sleep(3000);
    WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
    Thread.sleep(3000);
    deleteButton.click();
    Thread.sleep(3000);
    driver.close();
	
	

	}

}
