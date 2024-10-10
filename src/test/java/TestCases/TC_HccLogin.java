package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Login;
import testBase.BaseClass;

public class TC_HccLogin extends BaseClass
{
	
	   @Test(groups= {"Functional"})
		public void HCCLOGIN() throws InterruptedException
		{
		   try
		   {
		   
		   logger.info("Test Case Started");
		   
			Login obj=new Login(driver);
			obj.Login("test1hccadmin1@arthtechltd.com", "Pass@123");
			logger.info("Login Successfully");
			Thread.sleep(9000);
			
			HomePage A = new HomePage(driver);
			logger.info("Mainu panel is lock");
			A.LockMenu();
			Thread.sleep(4000);
			
			String confmsg = A.Heading();
			
			if(confmsg.equals("Residents"))
			{
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("Test Case is failed");
				logger.debug("Debug loggs");
				Assert.assertTrue(false);
			}
			System.out.println("Pass");
		   }
		   catch(Exception e)
		   {
			
			   Assert.fail();
		   }
		   
		}
		
		

}
