package givelify_SignIn_testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import givelify_SignIn_Page.SignInPage;

public class TC_09 extends BaseTestClass{
	
	@Test
	public void ResetPasswordTest() throws InterruptedException {
		
		SignInPage sp=new SignInPage(driver);
		sp.clickForgotPwd();
		Thread.sleep(3000);
		sp.ResetPswdEmailField.sendKeys(ValidEmail);
		logger.info("Valid Email Entered");
		sp.ResetPassword.click();
		Thread.sleep(3000);
		if(sp.Resetalert.getText().contains("Reset password link sent to your email address"))
     {
	Assert.assertTrue(true);
	logger.info("Reset link sent succesfully");
     }
		else
		{
			Assert.assertTrue(false);
			logger.info("Failed to send Reset link ");
		}

	}

}
