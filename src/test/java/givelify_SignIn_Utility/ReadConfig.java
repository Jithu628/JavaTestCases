package givelify_SignIn_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() {
		File src=new File("./Configuration/config.properties");
		
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);	
		} catch(Exception e) {
			System.out.println("Exception is"+e.getMessage());
		}
	}
	
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getValidEmail() {
		String email=pro.getProperty("ValidEmail");
		return email;
	}
	public String getUnregEmail() {
		String Unregemail=pro.getProperty("UnregEmail");
		return Unregemail;
	}
	public String getWrongFormatEmail() {
		String WrongFormatEmail=pro.getProperty("WrongFormatEmail");
		return WrongFormatEmail;
	}
	
	public String getValidpwd() {
		String pwd=pro.getProperty("Validpwd");
		return pwd;
	}
	public String getInValidpwd() {
		String Inpwd=pro.getProperty("Invalidpwd");
		return Inpwd;
	}
	
	public String getChromePath() {
		String Cpath=pro.getProperty("chromepath");
		return Cpath;
	}
	
	public String getFirefoxPath() {
		String ffpath=pro.getProperty("firefoxpath");
		return ffpath;
	}
}
