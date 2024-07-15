 package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleWebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		int allRow=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int allColumn=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println(allRow);
		System.out.println(allColumn);
		for(int i=1;i<allRow;i++)
		{
			for(int j=1;j<=allColumn;j++)
			{
				String cellValue = driver.findElement(By.xpath("//table[@id='customers']//tr[i]//th[j]")).getText();
				System.out.println(cellValue);
			}
		}

	}

}
