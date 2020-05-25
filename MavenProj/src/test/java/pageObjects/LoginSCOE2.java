package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSCOE2 {
	
	public WebDriver cdriver;
	static String environment;
	
	public LoginSCOE2(WebDriver rdriver)
	{
		cdriver=rdriver;
		PageFactory.initElements(cdriver, this);
	}

	
	@FindBy(id="username-hidden")
	@CacheLookup
	WebElement emailid;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement pwd;
	
	@FindBy(id="login-button")
	@CacheLookup
	WebElement loginbutton;
	
	public void setusername(String uname)
	{
		
		emailid.clear();
		emailid.sendKeys(uname);
	}
	
	public void setpwd(String passwd)
	{
		pwd.clear();
		pwd.sendKeys(passwd);
	}
	
	public void clickLogin()
	{
		loginbutton.click();
	}
	
}
