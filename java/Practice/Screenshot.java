package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Date date=new Date();
		String sysDate = date.toString().replace(" ","-").replace(":","-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		Actions action=new Actions(driver);
		/*WebElement link = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		File source = link.getScreenshotAs(OutputType.FILE);
		File destination=new File("./screenshots/errorshot1"+sysDate+".png");
		Files.copy(source, destination);*/
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/errorshot1"+sysDate+".png");
		Files.copy(source, destination);
		
	
		
		

	}

}
