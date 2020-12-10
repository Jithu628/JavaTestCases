package givelify_SignIn_testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import givelify_SignIn_Page.SignInPage;

public class TC_12 extends BaseTestClass{

@Test	
public void ResetPwdCancelTest() throws InterruptedException {
	
	SignInPage sp=new SignInPage(driver);
	sp.clickForgotPwd();
	Thread.sleep(3000);
	sp.Cancel.click();
	logger.info("Clicked Cancel");
	Thread.sleep(3000);
	if(driver.getTitle().contains("Anointed City of the Lord Online and Mobile Giving App"))
	{
		Assert.assertTrue(true);
		logger.info("Redirected to Login page , test passed");
		
	}
		
	else
	{
		Assert.assertTrue(false);
		logger.info("cancel button failed , test failed");
		
	}
	}
}
