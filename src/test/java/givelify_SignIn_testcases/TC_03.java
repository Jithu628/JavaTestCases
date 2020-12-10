package givelify_SignIn_testcases;

import org.testng.annotations.Test;

import givelify_SignIn_Page.SignInPage;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor; 

public class TC_03 extends BaseTestClass{

	@Test
	public void multipleLoginTest() throws InterruptedException {
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
		String user_name1=sp.user.getText();
		
		((JavascriptExecutor) driver).executeScript( "window.open('about:blank','_blank');"); 
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(baseURL);
		Thread.sleep(3000);
		String user_name2=sp.user.getText();
		if(sp.SignInButton.isDisplayed()==false &&  user_name2.equals(user_name1))
		{
			Assert.assertTrue(true);
			logger.info("Session maintained in the new tab, Test case passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Session not maintained in the new tab, Test case failed");
		}
	}
	
}
