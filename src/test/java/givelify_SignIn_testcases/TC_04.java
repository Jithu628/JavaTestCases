package givelify_SignIn_testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import givelify_SignIn_Page.SignInPage;

public class TC_04 extends BaseTestClass{

	@Test
	public void InvalidLoginTest() throws InterruptedException {
logger.info("URL Opened");
		
		SignInPage sp=new SignInPage(driver);
		sp.setEmail(ValidEmail);
		logger.info("Entered Email");
		sp.setPassword(Invalidpwd);
		logger.info("Entered invalid password");
		sp.clickLogin();
		Thread.sleep(3000);
		
		if(sp.Loginerror.isDisplayed() && sp.Loginerror.getText().contains("Your username and password don't match."))
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
