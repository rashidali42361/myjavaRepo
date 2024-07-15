package BasicTestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	 WebDriver driver;
	 public HomePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 this.driver=driver;
	 }
	 @FindBy(xpath="//div[@id='container_tasks']")
	 WebElement taskLink;
	 @FindBy(xpath="//div[@class='plusIcon']")
	WebElement addNewLink;
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	WebElement newCustomerLink;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	WebElement nameTextfield;
	@FindBy(xpath="//div[text()='Create Customer']")
	WebElement createCustomerButton;
	public void addNewCustomer()
	{
		taskLink.click();
		addNewLink.click();
		newCustomerLink.click();
		nameTextfield.sendKeys("Robot8678");
		createCustomerButton.click();
	}
	@FindBy(id="logoutLink")
	WebElement logoutButton;
	public void logoutAction()
	{
		logoutButton.click();
	}
	
    public String homePageTitle()
    {
    	return driver.getTitle();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


















