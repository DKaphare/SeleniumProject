package com.qa.registration.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.registration.base.BaseTest1;
import com.qa.registration.constants.AppConstants;
import com.qa.registration.utility.ExcelUtill;

public class NLoginTest extends BaseTest1 {

	@DataProvider
	public Object[][] LoginPara() {
		return new Object[][] { { "dipalikaphare.dk@gmail.com", "Bekind@1995" } };
	}

	@DataProvider
	public Object[][] LoginExcel() {
		return ExcelUtill.getTestData(AppConstants.sheet_Name);

	};

	@Test(dataProvider = "LoginPara")
	public void doLogin(String Email, String Pwd) {
		NL.Login(Email, Pwd);
		NL.LoginButton();
	}

}
