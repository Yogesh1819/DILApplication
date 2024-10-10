package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Practitioners extends BasePage 
{

	WebDriver driver;
	public Practitioners(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//p[text()='Accounts']")
	WebElement account;
	
	@FindBy(xpath="//p[text()='Practitioners']")
	WebElement practitioners;
	
	@FindBy(xpath="//button[@name=\"newButton\"]")
	WebElement newBtn;
	
	@FindBy(xpath="//h2[text()='Add Practitioner']")
	WebElement PractitionerHeading;
	
	@FindBy(xpath="//input[@name=\"firstName\"]")
	WebElement PractFirstName;
	
	@FindBy(xpath="//input[@name=\"lastName\"]")
	WebElement PractLastName;
	
	@FindBy(xpath="//input[@name=\"contactNumber\"]")
	WebElement PractContact;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement PractEmail;
	
	@FindBy(xpath="//button[@name=\"save\"]")
	WebElement Save;
	
	public void AccountPractitioner() throws InterruptedException
	{
		account.click();
		Thread.sleep(2000);
		practitioners.click();
		Thread.sleep(2000);
		newBtn.click();
		Thread.sleep(3000);
		
	}
	
	public String verifyPractitioner()
	{
		String practitionerheading=PractitionerHeading.getText();
		return practitionerheading;
	}
	
	public void CreatePractitioner(String fname,String lname,String contact,String email) throws InterruptedException
	{
		PractFirstName.sendKeys(fname);
		PractLastName.sendKeys(lname);
		PractContact.sendKeys(contact);
		PractEmail.sendKeys(email);
		Thread.sleep(4000);
		Save.click();
			
	}
	
	
	
	
	
	
	
}
