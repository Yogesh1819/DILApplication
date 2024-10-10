package TestCases;

import org.testng.annotations.Test;

import pageObjects.Accounts;
import pageObjects.HccLogin;
import pageObjects.HomePage;
import pageObjects.Installers;
import testBase.BaseClass;

public class TC_CreateInstaller extends BaseClass 
{
	@Test
	public void Createinstaller() throws InterruptedException
	{
		HccLogin login = new HccLogin(driver);
		login.hcclogin("test1hccadmin1@arthtechltd.com", "Pass@123");
		Thread.sleep(3000);
		HomePage home=new HomePage(driver);
		home.LockMenu();
		Accounts account = new Accounts(driver);
		account.Account();
		account.Installer();
		account.NewButton();
		Thread.sleep(2000);
		Installers installer=new Installers(driver);
		
		String heading=installer.verifyInstaller();
		if(heading.equalsIgnoreCase("Add Third party installer"))
		{
			System.out.println("Add Third party installer heading is verified");
		}
		else
		{
			System.out.println("The user is not redirected to the Add installer page");
		}
		
		installer.CreateInstaller("Quincy", "Benson", "876653","quincybenson@gmail.com");
	}

}
