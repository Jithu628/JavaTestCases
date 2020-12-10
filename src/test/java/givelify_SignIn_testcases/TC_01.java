package givelify_SignIn_testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import givelify_SignIn_Page.SignInPage;

public class TC_01 extends BaseTestClass {

	
	@Test
	public void ValidLoginTest() throws InterruptedException {
		
		logger.info("URL Opened");
		
		SignInPage sp=new SignInPage(driver);
		sp.setEmail(ValidEmail);
		logger.info("Entered Email");
		sp.setPassword(Validpwd);
		logger.info("Entered password");
		sp.clickLogin();
		Thread.sleep(3000);
		
		if(sp.Logmsg.isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Test case passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}
		
		
	}
}
