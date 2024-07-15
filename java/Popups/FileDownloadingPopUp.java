package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadingPopUp {

	public static void main(String[] args) throws AWTException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.imacros.net/automate/downloads");
	driver.findElement(By.xpath("//a[@href='/Content/Download2.zip']")).click();
	Robot robot = new Robot();
	//robot.keyPress(KeyEvent.VK_ENTER);

	}

}
