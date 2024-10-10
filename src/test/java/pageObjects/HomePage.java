package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
    	super(driver);	
	}
	
	@FindBy(xpath="(//p[text()='Home'])[2]")
    WebElement home;
	
	@FindBy(xpath="//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1zbqai\"]")
    WebElement lock;
	
	@FindBy(xpath="//h1[text()='Residents']")
    WebElement heading;
	
	
	
	
	public void LockMenu() throws InterruptedException
	{
		home.click();
		Thread.sleep(2000);
		lock.click();
	}
	
	public String Heading()
	{
		String Heading=heading.getText();
		
		return Heading;
	
	}
	
	
	
}
