package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C://java_program/printpop.html");
		driver.findElement(By.xpath("//button[@onclick='printPopUp()']")).click();
		driver.switchTo().alert().accept();
		Robot robot=new Robot();
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Runtime.getRuntime().exec("./src/test/resources/print.exe");
		
	

	}

}
