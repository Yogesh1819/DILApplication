package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accounts extends BasePage 
{
    public WebDriver driver;
	public Accounts(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//p[text()='Accounts']")
	WebElement account;
	
	@FindBy(xpath="//p[text()='Admins']")
	WebElement admins;
	
	@FindBy(xpath="//p[text()='Residents']")
	WebElement residents;
	
	@FindBy(xpath="//p[text()='Responders']")
	WebElement responders;
	
	@FindBy(xpath="//p[text()='Practitioners']")
	WebElement practitioners;
	
	@FindBy(xpath="//p[text()='Third party installers']")
	WebElement installers;
	
	@FindBy(xpath="//button[@name=\"newButton\"]")
	WebElement newBtn;
	
	public void Account()
	{
		account.click();
	}
	
	public void NewButton()
	{
		newBtn.click();
	}
	
	public void Admin()
	{
		admins.click();
	}
	
	public void Resident()
	{
		residents.click();
	}
	
	public void Responder()
	{
		responders.click();
	}
	
	public void Practitioner()
	{
		practitioners.click();
	}
	
	public void Installer()
	{
		installers.click();
	}
	
}
