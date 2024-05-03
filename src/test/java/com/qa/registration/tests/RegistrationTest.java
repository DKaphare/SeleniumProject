package com.qa.registration.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.registration.base.BaseTest;

import com.qa.registration.constants.AppConstants;
import com.qa.registration.utility.ElementUtill;
import com.qa.registration.utility.ExcelUtill;

public class RegistrationTest extends BaseTest {

	/*
	 * In PageTest class always return something
	 */

	@Test(priority = 1) // Every Test should have test steps and assertions
	public void RegPageURLTest() {
		String actRegtitle = RegistrationPage.getRegPageURL();
		Assert.assertEquals(actRegtitle, AppConstants.REGISTER_PAGE_URL);
	}

	@Test(priority = 2)
	public void RegPageTitleTest() {
		String actRegtitle = RegistrationPage.getRegPageTitle("Register Account");
		Assert.assertEquals(actRegtitle, AppConstants.REGISTER_PAGE_TITLE);
	}
	
	@DataProvider
	public Object[][] RegPara() {
		return new Object[][] {
			{"Dips1234", "Alh", " Z_8@gmail.com", " 9090909090", "1234567",
			"1234567"}
		};
	}
	
	@DataProvider
	public Object[][] RegParaUseExcel() {
		return ExcelUtill.getTestData(AppConstants.sheet_Name);
			
		};
	


	@Test(dataProvider="RegParaUseExcel")
	public void doRegistration(String fName,String lName, String emailID, String MNo,String pwd,String cpwd) throws InterruptedException {
		
		RegistrationPage.doRegistration(fName, lName, emailID, MNo, pwd, cpwd);
//		String verify = RegistrationPage.doRegistration("Dips123", "Alh", " A_7@gmail.com", " 9090909090", "1234567",
//				"1234567");

//		Assert.assertEquals(verify, AppConstants.REGISTER_PAGE_COMPLETE_TITLE);	
	}

	
	
	
/*	@Test(priority = 3)
	public void doRegistrationBlank() {

		String fError = RegistrationPage.doRegistrationBlank(AppConstants.ERROR_FNAME);
		Assert.assertEquals(fError, AppConstants.ERROR_FNAME);
		System.out.println(fError);
		RegistrationPage.doRegistrationBlank("Last Name must be between 1 and 32 characters!");
		RegistrationPage.doRegistrationBlank("E-Mail Address does not appear to be valid!");
		RegistrationPage.doRegistrationBlank("Telephone must be between 3 and 32 characters!");
		RegistrationPage.doRegistrationBlank("Password must be between 4 and 20 characters!");

	}

	@Test(priority = 4) // Every Test should have test steps and assertions
	public void isAccDisplayed() {
		RegistrationPage.isMyAccountDisplayed();
	
	}
	
	*/
}
