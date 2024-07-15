package Practice;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog6 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("ACd");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hjhzgjkjkl@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("896386jhbjhv");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8963869865");
		driver.findElement(By.xpath("//div[@class='focusable optionWrap  ']")).click();
		Thread.sleep(Duration.ofSeconds(4));
		WebElement uploadButton = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		Thread.sleep(Duration.ofSeconds(4));
		uploadButton.click();
		Runtime.getRuntime().exec("./autoIt/Upload.exe");
		Thread.sleep(Duration.ofSeconds(10));
		driver.quit();
		
		
		

	}

}
