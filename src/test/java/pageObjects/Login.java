package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage 
{
	WebDriver driver;
	public Login(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@name=\"username\"]")
    WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
    WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
    WebElement signin;
	
	@FindBy(xpath="//button[@name=\"createANewReferral\"]")
	WebElement referral;
	
	@FindBy(xpath="//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1e0hvrb\"]")
	WebElement logout;
	
	@FindBy(xpath="//input[@name=\"username\"]")
	WebElement userClear;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement passClear;
	
	
	
	public void Login(String UserName, String Password) throws InterruptedException
	{
		username.sendKeys(UserName);
		password.sendKeys(Password);
		signin.click();
		Thread.sleep(5000);
		
	}
	
	public boolean verify() throws InterruptedException
	{
		Thread.sleep(2000);
		return referral.isDisplayed();
		
	}
	
	public  void out()
	{
		logout.click();
	}
	
	public void UserClear()
	{
		userClear.clear();
		
	}
	
	public void PassClear()
	{
		passClear.clear();
	}
	
}
