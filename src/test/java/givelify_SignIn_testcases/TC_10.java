package givelify_SignIn_testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import givelify_SignIn_Page.SignInPage;

public class TC_10 extends BaseTestClass {

	@Test
	public void UnregEmailResetPwdTest() throws InterruptedException {
		
		SignInPage sp=new SignInPage(driver);
		sp.clickForgotPwd();
		Thread.sleep(3000);
		sp.ResetPswdEmailField.sendKeys(UnregEmail);
		logger.info("Unregistered Email Entered");
		sp.ResetPassword.click();
		Thread.sleep(3000);
		if(sp.ResUnregEmail.getText().contains("We could not find your email address"))
     {
	Assert.assertTrue(true);
	logger.info("Error message received, test passed");
     }
		else
		{
			Assert.assertTrue(false);
			logger.info("Failed to generate error");
		}

	}

}
