package Pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(id="username")
	WebElement usernameTextfield;
	@FindBy(id="password")
	WebElement passwordTextfield;
	@FindBy(id="submit")
	WebElement submitButton;
	public void loginAction(String username,String password)
	{
		usernameTextfield.sendKeys(username);
		passwordTextfield.sendKeys(password);
		submitButton.click();
		
	}

}
