package givelify_SignIn_testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import givelify_SignIn_Page.SignInPage;

public class TC_07 extends BaseTestClass{
	
	@Test
	public void ForgotpwdTest() throws InterruptedException {
		SignInPage sp=new SignInPage(driver);
		sp.clickForgotPwd();
		Thread.sleep(3000);
		if (sp.Modal.isDisplayed()&& sp.Modal.getText().contains("Recover your password"))
		{
			Assert.assertTrue(true);
			logger.info("Link is working");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Link is working");
		}
	}

}
