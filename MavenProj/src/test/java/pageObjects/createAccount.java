package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createAccount {

	
public WebDriver cdriver;
static String onlyaccount;
String accountreceived;
	
	public createAccount(WebDriver rdriver)
	{
		cdriver=rdriver;
		PageFactory.initElements(cdriver, this);
	}
	
		
	By otherMenu1=By.id("menu-button");
	By ordercenter1=By.xpath("//a[@href='#' and text()='Order center']");
	By mobileorder1=By.xpath("//a[@href='/ordercenter/Scoe2.do']");
	
	By createaccount1=By.xpath("//input[@id='createAccount']");
	By organisation1=By.id("organisationName");
	By kvkcheck1=By.name("KVKNumberCheck");
	By vatcheck1=By.name("BTWNumbercheck");
	By submit1_1=By.xpath("//*[@id='cdk-step-content-0-0']/form/div[4]/button");
	
	By fname1=By.name("firstName");
	By lname1=By.name("lastName");
	By phonenum1=By.name("phone");
	By mobilenum1=By.name("mobile");
	By uemail1=By.name("email");
	By submit2_1=By.xpath("//*[@id='cdk-step-content-0-1']/form/div/button[2]");
	
	By samedetailscheck1=By.name("sameContactAcc");
	By submit3_1=By.xpath("//*[@id='cdk-step-content-0-2']/form/div[2]/button[2]");
	
	By postal1=By.name("postalCode");
	By houseNo1=By.name("houseNumber");
	By checkAddr1=By.id("checkAddress");
	
	By adresscheck1=By.xpath("//div[@class='mat-elevation-z8']//mat-cell[1]");
	By submit4_1=By.xpath("//*[@id='cdk-step-content-0-3']/form/div[3]/button[2]");
	
	By bankAcc1=By.xpath("//*[contains(text(),'Debit')]");
	By bankgiro1=By.xpath("//span[contains(text(),'Giro 45')]");
	By submit5_1=By.xpath("//*[@id='cdk-step-content-0-4']/form/div[2]/button[2]");
	By gotoaccount=By.xpath("//*[@id='nav']/li[1]/a");
	
	//Action Method using above locators
	
	public String getPageTitle()
	{
		return cdriver.getTitle();
	}
	
	public void accoutcreation() throws InterruptedException{
		
		cdriver.findElement(otherMenu1).click();
		cdriver.findElement(ordercenter1).click();
		cdriver.findElement(mobileorder1).click();
		Thread.sleep(2000);
		cdriver.switchTo().frame("Wrapper");
		Thread.sleep(2000);
		cdriver.findElement(createaccount1).click();
		cdriver.findElement(organisation1).sendKeys("Org1");
		cdriver.findElement(kvkcheck1).click();
		cdriver.findElement(vatcheck1).click();
		cdriver.findElement(submit1_1).click();
		
		Thread.sleep(2000);
		
		cdriver.findElement(fname1).sendKeys("Test1");
		cdriver.findElement(lname1).sendKeys("Test2");
		cdriver.findElement(phonenum1).sendKeys("123234567");
		cdriver.findElement(mobilenum1).sendKeys("323234567");
		cdriver.findElement(uemail1).sendKeys("Testing@gmail.com");
		cdriver.findElement(submit2_1).click();
		
		Thread.sleep(2000);
		
		cdriver.findElement(samedetailscheck1).click();
		cdriver.findElement(submit3_1).click();
		
		Thread.sleep(2000);
		
		cdriver.findElement(postal1).sendKeys("1181LL");
		cdriver.findElement(houseNo1).sendKeys("466");
		cdriver.findElement(checkAddr1).click();
		Thread.sleep(1000);
		cdriver.findElement(adresscheck1).click();
		cdriver.findElement(submit4_1).click();
		
		Thread.sleep(2000);
		cdriver.findElement(bankAcc1).click();
		cdriver.findElement(bankgiro1).click();
		Thread.sleep(2000);
		cdriver.findElement(submit5_1).click();
		      
		}
	
	public void getAccountNumber() throws InterruptedException
	{
		Thread.sleep(30000);
		String message=cdriver.switchTo().alert().getText();
		onlyaccount = message.substring(message.lastIndexOf(" ") + 1);
	    System.out.println("Account created  " +onlyaccount);
	    Alert alert = cdriver.switchTo().alert();
        alert.accept();
	    Thread.sleep(4000);
        cdriver.findElement(gotoaccount).click();
       
       
	}
	
	public String setAccountNumber()
	{
		accountreceived=onlyaccount;
		return accountreceived;
	}
	

}
