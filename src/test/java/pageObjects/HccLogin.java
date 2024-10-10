package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HccLogin extends BasePage
{
	WebDriver driver;
	public HccLogin(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@name=\"username\"]")
    WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
    WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
    WebElement signin;
	
	
	public void hcclogin(String Username,String Password)
	{
		username.sendKeys(Username);
		password.sendKeys(Password);
		signin.click();
	}

}
