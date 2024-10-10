package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.Accounts;
import pageObjects.Admins;
import pageObjects.HccLogin;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_CreateAdmin extends BaseClass
{
	@Test(groups= {"Regression"})
	public void CreateAdmin() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		HccLogin login = new HccLogin(driver);
		login.hcclogin("test1hccadmin1@arthtechltd.com", "Pass@123");
		
		Thread.sleep(3000);
		HomePage home = new HomePage(driver);
		home.LockMenu();
		
		Accounts account = new Accounts(driver);
		account.Account();
		account.Admin();
		account.NewButton();
		
	  Admins admin=new Admins(driver);
	 String heading= admin.verifyAdmin();
	 
	 if(heading.equalsIgnoreCase("Add Admin"))
	 {
		 System.out.println("Add admin heading is verified");
	 }
	 else
	 {
		 System.out.println("Add admin heading in not verified");
	 }
	 
	 admin.CreatePractitioner("Test2", "Hccadmin2", "7387225564", "test2hccadmin2@arthtechltd.com");
	
	}

}
