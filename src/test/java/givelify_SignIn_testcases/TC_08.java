package givelify_SignIn_testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import givelify_SignIn_Page.SignInPage;

public class TC_08  extends BaseTestClass{
    @Test
	public void FgtPwdFieldValidation() throws InterruptedException {
		SignInPage sp=new SignInPage(driver);
		sp.clickForgotPwd();
		Thread.sleep(3000);
		if((sp.ResetPassword.isEnabled()==false) && sp.ResetPswdEmailField.isDisplayed() && sp.Cancel.isDisplayed())
		{
			sp.ResetPswdEmailField.sendKeys("Random");
			if(sp.ResetPassword.isEnabled())
			{
			Assert.assertTrue(true);
			logger.info("All Forgot password MOdal fields are validated");
			}
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Fields  validation failed");
		}
	}
}
