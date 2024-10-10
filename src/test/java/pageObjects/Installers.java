package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Installers extends BasePage 
{
	WebDriver driver;
	public Installers(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='Add Third party installer']")
	WebElement InstallerHeading;
	
	@FindBy(xpath="//input[@name=\"firstName\"]")
	WebElement InstallerFirstName;
	
	@FindBy(xpath="//input[@name=\"lastName\"]")
	WebElement InstallerLastName;
	
	@FindBy(xpath="//input[@name=\"contactNumber\"]")
	WebElement InstallerContact;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement InstallerEmail;
	
	@FindBy(xpath="//button[@name=\"save\"]")
	WebElement Save;
	
	
	public String verifyInstaller()
	{
		String installerheading=InstallerHeading.getText();
		return installerheading;
	}
	
	public void CreateInstaller(String fname,String lname,String contact,String email) throws InterruptedException
	{
		InstallerFirstName.sendKeys(fname);
		InstallerLastName.sendKeys(lname);
		InstallerContact.sendKeys(contact);
		InstallerEmail.sendKeys(email);
		Thread.sleep(4000);
		
			
	}
	

}
