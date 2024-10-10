package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_Login extends BaseClass
{
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class) //getting data provider from different class
	public void verify_Login(String email, String pwd, String exp )
	{
		logger.info("**** Starting Test Case");
		try
		{
		
		Login A = new Login(driver);
		A.Login(email, pwd);
		boolean targetPage=A.verify();
		
		
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetPage==true)
			
			{
				A.out();
				Assert.assertTrue(true);
			
				
				
			}
			else  
			{
				Assert.assertTrue(false);
			}
			
		}
		
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			
			if(targetPage==false)
		
			{
				
				A.out();
				Assert.assertTrue(false);
			
			}
			else
			{
				
				Assert.assertTrue(true);
			
			}	
			
		}

				
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		finally
		{
			Login A = new Login(driver);
		    A.UserClear();
		    A.PassClear();
		}
		
		logger.info("*****Finish Test Case ****");
	
	}
	

}
