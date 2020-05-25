package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import pageObjects.LoginSCOE2;
import pageObjects.Place510HV;
import pageObjects.PlaceP550;
import pageObjects.checkCLADB;
import pageObjects.createAccount;

public class steps  {
	
public WebDriver driver;
public LoginSCOE2 ls;
public createAccount ca;
public PlaceP550 po;
public checkCLADB cdb;
public Place510HV bhv;

static String environment;
	
@Given("^User open Chrome Browser$")
public void user_open_Chrome_Browser() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	ls=new LoginSCOE2(driver);
		 
}	
@Given("^SCOE URL is open \"([^\"]*)\"$")
public void scoe_URL_is_open(String url) 
{
	environment=url.substring(13, 16);
	System.out.println("Environment selected is "+environment );
driver.get(url);
driver.manage().window().maximize();

}

@Given("^Enter Username \"([^\"]*)\" and password as \"([^\"]*)\"$")
public void enter_Username_and_password_as(String user, String password)  {
	
	ls.setusername(user);
	ls.setpwd(password);
}

@When("^I click Login button$")
public void i_click_Login_button()  {
	ls.clickLogin();
}
    

@Then("^Login is sucessful$")
public void login_is_sucessful() {
	
	if(driver.getPageSource().contains("MY TELE2"))
	{
		System.out.println("Successfull Login");
	}
	else {
		System.out.println("UNSuccessfull Login");
	}
}


//Account creation (3/5/2020)
@And("^User opens Account creation page$")
public void user_opens_Account_creation_page() throws Exception  {
	 ca=new createAccount(driver);
    Assert.assertEquals("Customer Assignment", ca.getPageTitle());
    System.out.println("Titles Matched");
}

@Given("^Enter details for Account creation$")
public void enter_details_for_Account_creation() throws Throwable {
    Thread.sleep(3000);
	ca.accoutcreation();
}


@Then("^Account creation should be successful$")
public void account_creation_should_be_successful() throws Throwable {
	
	ca.getAccountNumber();

 
}

//Place p550 orders

@Then("^enter Account to place order$")
public void enter_Account_to_place_order() throws Throwable {
	po=new PlaceP550(driver);                                   //I missed initiation earlier
	po.selectAccount();
}

@Then("^Enter order details$")
public void enter_order_details() throws Throwable {
	po.enterOrderDetails();
}

@Then("^order should be placed successful$")
public void order_should_be_placed_successful() throws Throwable {
    
}

//DataBase validation

@Given("^User validate order status in DB$")
public void user_validate_order_status_in_DB() throws Throwable {
	String env=environment;
	cdb=new checkCLADB();
    cdb.checkorderInDB(env);
    
}

@Then("^enter Account to place HostedVoice order$")
public void enter_Account_to_place_HostedVoice_order() throws Throwable {
	bhv=new Place510HV(driver);
	bhv.BHVselectAccount();
   
}
@Then("^Enter details for HostedVoice order$")
public void enter_details_for_HostedVoice_order() throws Throwable {
	bhv.placeBHVorder();
    
}


}



