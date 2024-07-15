package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslPopup {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://expired.badssl.com/");

	}

}
