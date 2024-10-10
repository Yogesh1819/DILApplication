package TestCases;

import org.testng.annotations.Test;

import pageObjects.HccLogin;
import pageObjects.HomePage;
import pageObjects.Practitioners;
import testBase.BaseClass;

public class TC_CreatePractitioner extends BaseClass 
{
    @Test (groups= {"Regression"})
	public void CreatePractitionerAccount() throws InterruptedException
	{
    	
    	HccLogin login= new HccLogin(driver);
    	login.hcclogin("test1hccadmin1@arthtechltd.com", "Pass@123");
    	Thread.sleep(3000);
    	HomePage HP=new HomePage(driver);
    	HP.LockMenu();
    	Thread.sleep(2000);
	    Practitioners pract= new Practitioners(driver);
	    pract.AccountPractitioner();
	    String practHeading=pract.verifyPractitioner();
	 
	 if(practHeading.equalsIgnoreCase("Add Practitioner"))
	 {
		 System.out.println("Create Practitioner Form Is Displayed");
	 }
	 else
	 {
		 System.out.println("Create Practitioner Form Is NotDisplayed");
	 }
	 pract.CreatePractitioner("Quincy", "Benson", "7387225564", "quincybenson@arthtechltd.com");
	
	 
	 System.out.println("Practitioner Account Created Successfully");
	 
	}
}
