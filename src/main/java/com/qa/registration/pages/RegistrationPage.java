//package com.qa.registration.pages;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.qa.registration.constants.AppConstants;
//import com.qa.registration.utility.ElementUtill;
//
//import dev.failsafe.internal.util.Assert;
//
//public class RegistrationPage {
//	private WebDriver driver;
//	private ElementUtill eleUtill;
//	// 1. priavte By locators
//	/*
//	 * Martin Fowler- POM Owner we keep it as private coz id we make public anyone
//	 * can change the locator by over riding
//	 */
//	private By fName = By.id("input-firstname");
//	private By lName = By.id("input-lastname");
//	private By emailId = By.id("input-email");
//	private By Tel = By.id("input-telephone");
//	private By pwd = By.id("input-password");
//	private By cPwd = By.id("input-confirm");
//	private By PPBox = By.xpath("//input[@type='checkbox']");
//	private By con = By.xpath("//input[@value='Continue']");
//	private By Account = By.xpath("//span[text()='My Account']");
//	private By RegPageError=By.xpath("//div[@class='text-danger']");
//	
//	private By logout= By.linkText("Logout");
//	
//
//	// 2.Public page constructor
//
//	public RegistrationPage(WebDriver driver) {
//		this.driver = driver;
//		eleUtill = new ElementUtill(driver); //Can check for other classes also
//
//	}
//	// 3.Public page actions
//
//	public String getRegPageTitle(String title) {
//		
//		String regtitle =eleUtill.waitGetTitle(AppConstants.REGISTER_PAGE_TITLE, AppConstants.SHORT_TIME_OUT);
//		System.out.println("Page Title is "+regtitle );
//		return regtitle;
//
//	} 
//
//	public String getRegPageURL() {
//		String regURL = driver.getCurrentUrl();
//		
//		return regURL;
//
//	}
//
//	public String doRegistration(String first, String last, String email, String string, String pass, String cpaas) throws InterruptedException {
//		WebDriverWait WD1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
////		eleUtill.waitForElementVisible1(fName,AppConstants.SHORT_TIME_OUT);
//		System.out.println("       Registration starts for    " + first);
//		eleUtill.doSendKeys(fName, first);
//		eleUtill.doSendKeys(lName, last);
//		eleUtill.doSendKeys(emailId, email);
//		eleUtill.doSendKeys(Tel, string);
//		eleUtill.doSendKeys(pwd, pass);
//		eleUtill.doSendKeys(cPwd, cpaas);
//		eleUtill.doClick(PPBox);
//		eleUtill.doClick(con);
//		
//		String title=driver.getTitle();
//		
//
//		Thread.sleep(2000);
//		eleUtill.doClick(logout);
//		
//		return eleUtill.waitGetTitle(AppConstants.REGISTER_PAGE_COMPLETE_TITLE, AppConstants.SHORT_TIME_OUT);
//	}
//
//	public String doRegistrationBlank(String ActText) {
//		eleUtill.doClick(con);
//		return eleUtill.toCheckError(RegPageError,ActText);
//	}
//	public boolean isMyAccountDisplayed() {
//		return eleUtill.waitFortextToBePresent(Account,"Account" , 5);
//	}
//
//
//	
//
//	
//	/*Page chaining is to continue with previous page
//	 * e.g Login->after login screen we have Account screen where we have to provide some assertions so contniue with login what we can do
//	 * 1)in Login,java the dologin method we can create Accountpage object
//	 * return acc=new Account()
//	 * 2)BaseTest->Declare the Account object same as elementUtill it can useful in another class
//	 * 3) AccountPage Test-> call that variable(which is written in dologin method)
//	 * acc= LoginPage<from where tostart>.do Login("username","Pwd")
//	 * 
//	 * other @test we can write
//	 * 
//	 */
//}
