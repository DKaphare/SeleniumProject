package com.qa.registration.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import com.qa.registration.factory.Drive;
import com.qa.registration.pages.CRMLogin;
import com.qa.registration.pages.CountResult;
import com.qa.registration.pages.HomePage;
import com.qa.registration.pages.Images;

import com.qa.registration.factory.DriverFactory;

import com.qa.registration.pages.SearchProduct;

import com.qa.registration.utility.ElementUtill;

public class BaseTest {
	/*
	 * why bcoz we r not able to fetch ,methods of registration in test class by
	 * writting just (RegistrationPage.) bcoz its acces modifer is default and
	 * deafualt not allowed to access outside of package so we make it protected
	 */
	WebDriver driver;
	protected Properties prop;

	Drive DF;
	protected ElementUtill ele;
	protected HomePage HP;
	protected Images I;
	protected CRMLogin CRM;
	protected CountResult CR;


	/*
	 * Keep in mind only provide ``new variable which is defined above only,we have
	 * already defined new variable name above RegistrationPage RegistrationPage =
	 * new RegistrationPage(driver); //this is wrong
	 */

	@BeforeTest
	public void setup() {
		DF = new Drive();
		prop=DF.initProp();
		driver = DF.initDriver(prop); // very imp step store method in driver variable
//		prop = DF.initProp();
		HP = new HomePage(driver);
		I=new Images(driver);
		CRM=new CRMLogin(driver);
		CR=new CountResult(driver);

=======
//	protected RegistrationPage RegistrationPage;
	protected LoginPage LoginPg;
	protected AccountPage accPage;
	protected SearchProduct SerchProd;
	protected productInfo info;	
	DriverFactory drF;
	protected ElementUtill eleUtill;
	
	/*Keep in mind only provide ``new variable which is defined above only,we have already defined new variable name above
	 *  RegistrationPage RegistrationPage = new RegistrationPage(driver); //this is wrong */
	@BeforeTest
	public void setup() {
		drF=new DriverFactory();
		prop=drF.initProp();
		driver=drF.initDriver(prop);
		
		LoginPg=new LoginPage(driver);
//		RegistrationPage  = new RegistrationPage (driver);
		
		/*driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().deleteAllCookies();
		
		eleUtill=new ElementUtill(driver);
*/
>>>>>>> 8f5ff2aa65c3f8c9923965b09d983131bc846439
	}

	@AfterTest
	public void tearDown() {
//		driver.quit();
	}
}
