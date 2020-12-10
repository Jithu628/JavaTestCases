package givelify_SignIn_testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import givelify_SignIn_Page.SignInPage;

public class TC_06 extends BaseTestClass{
	
	@Test
	public void FormvalidationTest() throws InterruptedException {
		
logger.info("URL Opened");
		
		SignInPage sp=new SignInPage(driver);
		sp.setEmail(WrongFormatEmail);
		logger.info("Entered Wrong Format Email id");
		sp.setPassword(Validpwd);
		logger.info("Entered password");
		sp.EmailField.click();
		sp.clickLogin();
		Thread.sleep(3000);                                                
	
		
		if(sp.Wrongemailformat.isDisplayed() && sp.Wrongemailformat.getText().contains("This field must be an email"))
		{
			Assert.assertTrue(true);
			logger.info("Form validation is implemented, Test case passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}
	}
	
}

	
