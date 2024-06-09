package com.qa.registration.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.registration.factory.DriverFactory;
import com.qa.registration.pages.AccountPage;
import com.qa.registration.pages.LoginPage;
import com.qa.registration.pages.RegistrationPage;
import com.qa.registration.pages.SearchProduct;
import com.qa.registration.pages.TutorialSearch;
import com.qa.registration.pages.productInfo;
import com.qa.registration.utility.ElementUtill;


public class BaseTest {

	/*
	 * why bcoz we r not able to fetch ,methods of registration in test class by
	 * writting just (RegistrationPage.) bcoz its acces modifer is default and
	 * deafualt not allowed to access outside of package so we make it protected
	 */
	WebDriver driver;
	protected Properties prop;
	protected RegistrationPage RegistrationPage;
	protected LoginPage LoginPg;
	protected AccountPage accPage;
	protected SearchProduct SerchProd;
	protected productInfo info;	
	DriverFactory drF;
	protected ElementUtill eleUtill;
	protected TutorialSearch TS;
	
	/*Keep in mind only provide ``new variable which is defined above only,we have already defined new variable name above
	 *  RegistrationPage RegistrationPage = new RegistrationPage(driver); //this is wrong */
	@BeforeTest
	public void setup() {
		drF=new DriverFactory();
		prop=drF.initProp();
		driver=drF.initDriver(prop);
		
//		LoginPg=new LoginPage(driver);
//		RegistrationPage  = new RegistrationPage (driver);
		TS =new TutorialSearch(driver);
		/*driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().deleteAllCookies();
		
		eleUtill=new ElementUtill(driver);
*/
	}

	@AfterTest
	public void tearDown() {
//		driver.quit();
	}}

	
	
