package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPopUps {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		Robot robot=new Robot();
		Thread.sleep(Duration.ofSeconds(5));
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(Duration.ofSeconds(5));
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(Duration.ofSeconds(5));
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(Duration.ofSeconds(5));
		driver.quit();
		

	}

}
