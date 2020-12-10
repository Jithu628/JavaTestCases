package givelify_SignIn_testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import givelify_SignIn_Page.SignInPage;
public class TC_02 extends BaseTestClass{

	@Test
	public void logSessionTest() throws InterruptedException {

		logger.info("URL Opened");
		
		SignInPage sp=new SignInPage(driver);
		sp.setEmail(ValidEmail);
		logger.info("Entered Email");
		sp.setPassword(Validpwd);
		logger.info("Entered password");
		sp.clickLogin();
		Thread.sleep(3000);
		sp.ContinueButton.click();
		logger.info("Clicked Continue");
		String user_name=sp.user.getText();
	driver.navigate().back();
	logger.info("Clicked back button");
	if(sp.user.isDisplayed() && sp.user.getText().equals(user_name))
	{
		Assert.assertTrue(true);
		logger.info("Login session is maintained, Test case passed");
	}
	else
	{
		Assert.assertTrue(false);
		logger.info("Login session is not maintained, Test case failed");	
	}
	}
	
}
