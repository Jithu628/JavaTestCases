package givelify_SignIn_testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import givelify_SignIn_Utility.ReadConfig;

public class BaseTestClass {
	
	ReadConfig readconfig=new ReadConfig();

	//https://onlinegiving.givelify.com/bga/anointed-city-of-the-lord-indianapolis-in-2j7wy5OTA=/donation/amount  
	public String baseURL=readconfig.getApplicationURL();
	public static WebDriver driver;
	public String ValidEmail=readconfig.getValidEmail();
	public String UnregEmail=readconfig.getUnregEmail();
	public String WrongFormatEmail=readconfig.getWrongFormatEmail();
	public String Validpwd=readconfig.getValidpwd();
	public String Invalidpwd=readconfig.getInValidpwd();
	public static Logger logger ;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver=new ChromeDriver();
		}
		else 
		{
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver=new FirefoxDriver();	
		}
		driver.get(baseURL);
		 logger = Logger.getLogger("Givelify");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
