package givelify_SignIn_testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import givelify_SignIn_Page.SignInPage;

public class TC_05 extends BaseTestClass{
	
	@Test
	public void UnregLoginTest() throws InterruptedException {
		
logger.info("URL Opened");
		
		SignInPage sp=new SignInPage(driver);
		sp.setEmail(UnregEmail);
		logger.info("Entered Unregistered Email");
		sp.setPassword(Validpwd);
		logger.info("Entered password");
		sp.clickLogin();
		Thread.sleep(3000);
		
		if(sp.Loginerror.isDisplayed() && sp.Loginerror.getText().contains("If you don't have an account to give on Givelify, you can sign up by pressing Join Givelify"))
		{
			Assert.assertTrue(true);
			logger.info("Login Denied, Proper error message displayes, Test case passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}
	}
	
}
