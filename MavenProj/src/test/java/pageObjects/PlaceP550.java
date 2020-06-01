package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import utilities.waitHelper;

public class PlaceP550  {

	
public WebDriver cdriver;
//String bundle ="/html/body/app-root/div/app-account-frame/app-questionaire/div[2]/div/div/div[1]/div/div/div/app-configurator/div[1]/form/div[2]/app-section/app-section[2]/div/app-question[42]/div/div[1]/div/div/ng-select/div/div/div[3]/input";
String bundle="//*[@id='QE550_ZMRegular|Q-4527']//div[2]";

waitHelper wh;
createAccount ca1;
static String accountnumber1;	
static String neworder;
public PlaceP550(WebDriver rdriver)
{
	cdriver=rdriver;
	PageFactory.initElements(cdriver, this);
}
	
	By otherMenu1=By.id("menu-button");
	By ordercenter1=By.xpath("//a[@href='#' and text()='Order center']");
	By mobileorder1=By.xpath("//a[@href='/ordercenter/Scoe2.do']");
	
	
	By accountid=By.xpath("//input[@name='accId']");
	By searchButton=By.id("search");
	By selectAccount=By.xpath("/html/body/app-root/div/app-serach-account/div/table/tbody/tr/td[1]");
	By selectSchedule=By.xpath("//*[@id='1']/td[1]");
	By selectSchedule2=By.xpath("//*[@id='childScheduleIdVal']/table/tbody/tr/td");
	By selectMobile=By.xpath("//a[@id='productCategory' and text()='Mobile']");
	//By selectsub=By.xpath("//div[contains(text(),'Zakelijk Mobiel - Subscriptions')]");
	By selectsub=By.xpath("//*[@id='productInfo']");
	
	By proposition=By.xpath("//*[@id='mat-radio-5']/label/div[2]/div");
	By subscription =By.xpath("//*[@id='subscriptionRadio'][2]");
	By databundle =By.xpath("//ng-select[@ng-reflect-name='QE550_ZMRegular|Q-4527']/div/div/div[3]/input");
	//By databundle = By.xpath(bundle);
	By bundlesize =By.xpath("//span[contains(text(),'3GB')]");
	By salesforce =By.xpath("//*[@id='QE550_ZMRegular|Q-3296']/div/input");
	By calcprice =By.id("calculatePriceBtn");
	
	
	By addtocart =By.id("addToCart");
	By tocheckout =By.id("toCheckOut");
	By clickcontinue =By.xpath("//button[@id='cartContinue']");
	By confirm =By.xpath("//mat-panel-title[@id='confirmOrder']");
	By placeorder =By.xpath("//input[@id='placeOrder']");
	By orderid =By.xpath("/html/body/app-root/div/app-account-frame/app-cart-page-3/div/p/strong[2]/span");
	By getorderid =By.xpath("//div[@class='mat-elevation-z8 ng-star-inserted']//mat-cell[1]");
	
	public void selectAccount() throws InterruptedException
	{
		
		//String accountnumber1;
//Temp Removed		
		/*cdriver.findElement(otherMenu1).click();
		cdriver.findElement(ordercenter1).click();
		cdriver.findElement(mobileorder1).click();
		cdriver.switchTo().frame("Wrapper");*/
//New code removed
		Thread.sleep(4000);
		System.out.println(" Trying to fetch account number now");
		accountnumber1=ca1.onlyaccount;
	 System.out.println(" Received Account number is "+accountnumber1);
	 Thread.sleep(3000);
	cdriver.findElement(accountid).sendKeys(accountnumber1);
		Thread.sleep(4000);
		String abc=cdriver.getTitle();
		System.out.println("Currently on  "+abc+"  page");
		
	
		cdriver.findElement(searchButton).click();
		Thread.sleep(2000);
		cdriver.findElement(selectAccount).click();
		Thread.sleep(2000);
		
		cdriver.findElement(selectSchedule).click();
		Thread.sleep(1000);
		cdriver.findElement(selectSchedule2).click();
		Thread.sleep(2000);
		cdriver.findElement(selectMobile).click();
		Thread.sleep(1000);
		cdriver.findElement(selectsub).click();
		
		Thread.sleep(6000);
	}
	// Enter ORder Details
	public void enterOrderDetails() throws InterruptedException
	{
		Thread.sleep(2000);
		cdriver.findElement(proposition).click();
		Thread.sleep(3000);
		cdriver.findElement(subscription).click();
		Thread.sleep(3000);
		cdriver.findElement(databundle).sendKeys("3GB");
		cdriver.findElement(databundle).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		cdriver.findElement(salesforce).sendKeys("123234");
		
		cdriver.findElement(calcprice).click();
		Thread.sleep(3000);
		cdriver.findElement(addtocart).click();
		Thread.sleep(3000);
		cdriver.findElement(tocheckout).click();
		Thread.sleep(3000);
		cdriver.findElement(clickcontinue).click();
		cdriver.findElement(confirm).click();
		cdriver.findElement(placeorder).click();
		Thread.sleep(3000);
		String order=cdriver.findElement(By.xpath("//div[@class='maincontent']/p")).getText();
		System.out.println(order);
		cdriver.findElement(orderid).click();
		Thread.sleep(5000);
		neworder= cdriver.findElement(getorderid).getText();
		
		System.out.println("New order id Generated is   "+neworder);
		cdriver.close();
		
	}

	
	
}
