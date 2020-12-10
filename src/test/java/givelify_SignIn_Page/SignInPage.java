package givelify_SignIn_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver ldriver;
	
	public SignInPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);		
	}
	
	@FindBy(xpath="//span[contains(@class,'menu-list-icon')]")
	public
	WebElement SignInButton;
	
	@FindBy(xpath="//input[@type='email']")
	public
	WebElement EmailField;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement PasswordField;
	
	@FindBy(xpath="//button[text()='Sign In']")
	public
	WebElement Login;
	
	@FindBy(xpath= "//span[contains(text(),'You have successfully logged in.')]")
	public
	WebElement Logmsg;

	@FindBy(xpath= 	"//button[text()='Continue']")
	public
	WebElement ContinueButton;
	
	@FindBy(css=".alert-danger")
	public
	WebElement Loginerror;
	
	@FindBy(css=".username")
	public
	WebElement user;
	
	@FindBy(xpath="//span[contains(text(),'This field must be an email')]")
	public
	WebElement Wrongemailformat;
	
	@FindBy(css=".poiter")
	WebElement ForgotPassword;
	
	@FindBy(css=".ReactModal__Content")
	public
	WebElement Modal;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/div/div/div[1]/div/div/input")
	public
	WebElement ResetPswdEmailField;
	
	@FindBy(xpath="//button[text()='Reset Password']")
	public
	WebElement ResetPassword;
	
	@FindBy(xpath="//button[text()='Cancel']")
	public
	WebElement Cancel;
	
	@FindBy(css=".alert-success")
	public
	WebElement Resetalert;
	
	@FindBy(xpath="//span[contains(text(),'We could not find your email address')]")
	public
	WebElement ResUnregEmail;
	
	@FindBy(xpath="//span[contains(text(),'This field must be an email')]")
	public
	WebElement ResWrongEmailFormat;
	
	
	
	public void signIn() {
		SignInButton.click();
	}
	
	public void setEmail(String Email) {
		EmailField.sendKeys(Email);
	}
	
	public void setPassword(String pwd) {
		PasswordField.sendKeys(pwd);
	}
	
	public void clickLogin() {
		Login.click();
	}
	public void clickForgotPwd() {
		ForgotPassword.click();
	}


}
