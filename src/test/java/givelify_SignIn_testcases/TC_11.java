package givelify_SignIn_testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import givelify_SignIn_Page.SignInPage;

public class TC_11 extends BaseTestClass {

	@Test
	public void RestPwdFormValidation() throws InterruptedException {
		
		SignInPage sp=new SignInPage(driver);
		sp.clickForgotPwd();
		Thread.sleep(3000);
		sp.ResetPswdEmailField.sendKeys(WrongFormatEmail);
		logger.info("invalid format Email Entered");
		sp.ResetPassword.click();
		Thread.sleep(3000);
		if(sp.ResWrongEmailFormat.getText().contains("This field must be an email"))
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
