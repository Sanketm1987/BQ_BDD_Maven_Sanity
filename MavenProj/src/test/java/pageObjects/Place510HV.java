package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.waitHelper;

public class Place510HV {
	
	public WebDriver cdriver;
	createAccount ca1;
	static String accountnumberHv;	
	static String neworderhv;
	String block="//*[@id='myform']/div/app-section[1]/app-section[8]/div/app-question/div/div[3]/div/div/div/div[2]/form/div/table/tbody/tr/td[2]/div/div/div/select";
	String closewindow="//*[@id='myform']/div/app-section[1]/app-section[8]/div/app-question[2]/div/div[3]/div/div/div/div[1]/button/span";
	public Place510HV(WebDriver rdriver)
	{
		cdriver=rdriver;
		PageFactory.initElements(cdriver, this);
	}

	By accountid1=By.xpath("//input[@name='accId']");
	By searchButton1=By.id("search");
	By selectAccount1=By.xpath("/html/body/app-root/div/app-serach-account/div/table/tbody/tr/td[1]");
	By selectSchedule1=By.xpath("//*[@id='1']/td[1]");
	By selectSchedule3=By.xpath("//*[@id='childScheduleIdVal']/table/tbody/tr/td");
	By selectBhv=By.xpath("//a[@id='productCategory' and text()='FMC']");
	By selectsub1=By.xpath("//*[@id='productInfo']");
	
		
	//orderPage xpaths
		By unlimited =By.xpath("//*[@id='mat-radio-5']/label/div[2]/div");
		By combiseat =By.xpath("//*[@id='mat-slide-toggle-2']/label/div/div");
		By combiseat1 =By.xpath("//*[@id='QE005_1_unl_prof|Q-7805']/div[1]/input");
		By basicfixedonly =By.xpath("//*[@id='mat-slide-toggle-3']/label/div/div");
		By basicfixedonly1 =By.xpath("//*[@id='QE005_1_unl_prof|Q-9114']/div/input");
		By basicmobileonly =By.xpath("//*[@id='mat-slide-toggle-4']/label/div/div");
		By basicmobileonly1 =By.xpath("//*[@id='QE005_1_unl_prof|Q-9115']/div/input");
		By callcenter = By.xpath("//*[@id='mat-slide-toggle-5']/label/div/div");
		By callcenter1=By.xpath("//*[@id='QE005_virt_prof|Q-9117']/div/input");
		By flexprofile =By.xpath("//*[@id='mat-slide-toggle-7']/label/div/div");
		By flexprofile1 =By.xpath("//*[@id='QE005_virt_prof|Q-9119']/div/input");
		By huntgroup =By.xpath("//*[@id='mat-slide-toggle-8']/label/div/div");
		By huntgroup1 =By.xpath("//*[@id='QE005_virt_prof|Q-9120']/div/input");
		By ivr =By.xpath("//*[@id='mat-slide-toggle-9']/label/div/div");
		By ivr1 = By.xpath("//*[@id='QE005_virt_prof|Q-9121']/div/input");
		By ucone =By.xpath("//*[@id='mat-slide-toggle-10']/label/div/div");
		By ucone1 =By.xpath("//*[@id='QE005_virt_prof|Q-4517']/div/input");
		By secretary =By.xpath("//*[@id='mat-slide-toggle-12']/label/div/div");
		By secretary1 =By.xpath("//*[@id='QE005_virt_prof|Q-2471']/div/input");
		By manager=By.xpath("//*[@id='mat-slide-toggle-13']/label/div/div");
		By manager1=By.xpath("//*[@id='QE005_virt_prof|Q-2473']/div/input");
		By employee = By.xpath("//*[@id='mat-slide-toggle-14']/label/div/div");
		By employee1 = By.xpath("//*[@id='QE005_virt_prof|Q-2475']/div/input");
		
//Geo graphical
		By geographical =By.xpath("//*[@id='QE510_1_new_geo|Q-5781']/div/input");
		By geobutton =By.xpath("//*[@id='QE510_1_new_geo|Q-5781']/div/span/input");
		By areacode=By.xpath("//*[@id='questionTextBox']");
		By blocksize =By.xpath(block);
		By validate=By.xpath("//input[@value='Validate']");
		By Reserve=By.xpath("//input[@value='Reserve']");
		By closewin=By.xpath(closewindow);
//Final
		By salesforceid=By.xpath("//*[@id='QE005_remain|Q-3296']/div/input");
	    By calcprice =By.xpath("//input[@id='calculatePriceBtn']");
	    By cart =By.xpath("//input[@value='Add To Cart']");
	    By checkout=By.xpath("//input[@value='To Checkout']");
	    By continue1 =By.xpath("//button[@id='cartContinue']");
	    By confirm1 =By.xpath("//mat-panel-title[@id='confirmOrder']");
		By placeorder =By.xpath("//input[@id='placeOrder']");
		By orderid1 =By.xpath("/html/body/app-root/div/app-account-frame/app-cart-page-3/div/p/strong[2]/span");
		By getorderid1 =By.xpath("//div[@class='mat-elevation-z8 ng-star-inserted']//mat-cell[1]");
	

	public void BHVselectAccount() throws InterruptedException
	{
		Thread.sleep(8000);
		System.out.println(" Trying to fetch account number now");
		accountnumberHv=ca1.onlyaccount;
	 System.out.println(" Received Acoount numer is "+accountnumberHv);
	 Thread.sleep(3000);
	cdriver.findElement(accountid1).sendKeys(accountnumberHv);
 	Thread.sleep(4000);
		String abc=cdriver.getTitle();
		System.out.println("Currently on  "+abc+"  page");
		cdriver.findElement(searchButton1).click();
		Thread.sleep(2000);
		cdriver.findElement(selectAccount1).click();
		Thread.sleep(2000);
		
		cdriver.findElement(selectSchedule1).click();
		Thread.sleep(1000);
		cdriver.findElement(selectSchedule3).click();
		Thread.sleep(2000);
		cdriver.findElement(selectBhv).click();
		Thread.sleep(1000);
		cdriver.findElement(selectsub1).click();
		
		Thread.sleep(6000);
	}
    
   	public void placeBHVorder() throws InterruptedException
	{
   		
   		Thread.sleep(4000);
   		//cdriver.findElement(By.xpath("//*[@id='QE510_1_generic|Q-7896']/div/input")).sendKeys("1.111111");
   		//JavascriptExecutor executor = (JavascriptExecutor) cdriver;
		//executor.executeScript("arguments[0].click();", unlimited);
   		cdriver.findElement(unlimited).click();
   		Thread.sleep(4000);
   		cdriver.findElement(combiseat).click();
   		cdriver.findElement(combiseat1).clear();
   		cdriver.findElement(combiseat1).sendKeys("10");
   		Thread.sleep(2000);
   		cdriver.findElement(basicfixedonly).click();
   		Thread.sleep(2000);
   		cdriver.findElement(basicfixedonly1).clear();
   		cdriver.findElement(basicfixedonly1).sendKeys("5");
   		Thread.sleep(2000);
   		cdriver.findElement(basicmobileonly).click();
   		Thread.sleep(2000);
   		cdriver.findElement(basicmobileonly1).clear();
   		cdriver.findElement(basicmobileonly1).sendKeys("5");
   		
   		
   		cdriver.findElement(callcenter).click();
   		cdriver.findElement(callcenter1).clear();
   		cdriver.findElement(callcenter1).sendKeys("2");
   		cdriver.findElement(flexprofile).click();
   		cdriver.findElement(flexprofile1).clear();
   		cdriver.findElement(flexprofile1).sendKeys("2");
   		cdriver.findElement(huntgroup).click();
   		cdriver.findElement(huntgroup1).clear();
   		cdriver.findElement(huntgroup1).sendKeys("2");
   		cdriver.findElement(ivr).click();
   		cdriver.findElement(ivr1).clear();
   		cdriver.findElement(ivr1).sendKeys("2");
   		
   		cdriver.findElement(ucone).click();
   		cdriver.findElement(ucone1).clear();
   		cdriver.findElement(ucone1).sendKeys("2");
   		cdriver.findElement(secretary).click();
   		cdriver.findElement(secretary1).clear();
   		cdriver.findElement(secretary1).sendKeys("2");
   		cdriver.findElement(manager).click();
   		cdriver.findElement(manager1).clear();
   		cdriver.findElement(manager1).sendKeys("2");
   		cdriver.findElement(employee).click();
   		cdriver.findElement(employee1).clear();
   		cdriver.findElement(employee1).sendKeys("2");
   		
   		cdriver.findElement(geographical).sendKeys("1");
   		cdriver.findElement(geobutton).click();
   		Thread.sleep(2000);
   		cdriver.findElement(areacode).sendKeys("010");
   		Thread.sleep(2000);
   		cdriver.findElement(blocksize).click();
   		cdriver.findElement(blocksize).sendKeys("1");
   		cdriver.findElement(blocksize).sendKeys(Keys.ENTER);
   		Thread.sleep(4000);
   		cdriver.findElement(validate).click();
   		Thread.sleep(6000);
   		cdriver.findElement(Reserve).click();
   		Thread.sleep(5000);
   		cdriver.findElement(closewin).click();
   		Thread.sleep(3000);
   		  		
   		cdriver.findElement(salesforceid).sendKeys("234356");
   		cdriver.findElement(calcprice).click();
   		Thread.sleep(3000);
   		cdriver.findElement(cart).click();
   		Thread.sleep(3000);
   		cdriver.findElement(checkout).click();
   		Thread.sleep(3000);
   		cdriver.findElement(continue1).click();
   		cdriver.findElement(confirm1).click();
   		cdriver.findElement(placeorder).click();
   		Thread.sleep(3000);
   		String order1=cdriver.findElement(By.xpath("//div[@class='maincontent']/p")).getText();
   		System.out.println(order1);
   		cdriver.findElement(orderid1).click();
   		Thread.sleep(5000);
   		cdriver.findElement(By.xpath("//input[@value='Refresh']")).click();
   		neworderhv= cdriver.findElement(getorderid1).getText();
   		System.out.println("New order id Generated is   "+neworderhv);
   		cdriver.close();
}
	

}
