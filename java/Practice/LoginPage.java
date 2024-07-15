package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

public class LoginPage {
	
	public static void main(String[] args) throws IOException {
		Date date = new Date();
		String sysDate = date.toString().replace(" ", "-").replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/b/?ie=UTF8&node=89266439031&ext=6823-31414&ref=pd_sl_5szpgfto9i_e&tag=googhydrabk1-21&hvpos=&hvnetw=g&hvrand=17675978095179537830&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040183&hvtargid=kwd-64107830&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=610780881833&hvpos=&hvnetw=g&hvrand=176759780951");
		WebElement element = driver.findElement(By.xpath("(//span[text()='Sign in'])[3]"));
		File source = element.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/errorshot1"+sysDate+".png");
		Files.copy(source, destination);

	}

	
	}
