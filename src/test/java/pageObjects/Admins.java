package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admins extends BasePage
{
	WebDriver driver;
	public Admins(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='Add Admin']")
	WebElement AdminHeading;
	
	@FindBy(xpath="//input[@name=\"firstName\"]")
	WebElement AdminFirstName;
	
	@FindBy(xpath="//input[@name=\"lastName\"]")
	WebElement AdminLastName;
	
	@FindBy(xpath="//input[@name=\"contactNumber\"]")
	WebElement AdminContact;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement AdminEmail;
	
	@FindBy(xpath="//button[@name=\"save\"]")
	WebElement Save;
	
	public String verifyAdmin()
	{
		String adminheading=AdminHeading.getText();
		return adminheading;
	}
	
	public void CreatePractitioner(String fname,String lname,String contact,String email) throws InterruptedException
	{
		AdminFirstName.sendKeys(fname);
		AdminLastName.sendKeys(lname);
		AdminContact.sendKeys(contact);
		AdminEmail.sendKeys(email);
		Thread.sleep(4000);
		Save.click();
			
	}
	

}
