package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Date date=new Date();
		String sysDate = date.toString().replace(" ", "-").replace(":","-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=3239819561732463956&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299124&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
        TakesScreenshot ts=(TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination=new File("./screenshots/errorshot"+sysDate+".png");
       // Files.copy(source, destination);
        driver.findElement(By.linkText("End of season sale")).click();
        WebElement img = driver.findElement(By.xpath("(//img[@class='a-dynamic-image sl-sobe-carousel-sub-card-img'])[2]"));
       File source2 = img.getScreenshotAs(OutputType.FILE);
       File destination2=new File("./screenshots/errorshot"+sysDate+"element.png");
       Files.copy(source2, destination2);
        System.out.println(sysDate);

	}

}
