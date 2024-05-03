package com.qa.registration.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.registration.base.BaseTest;
import com.qa.registration.pages.AccountPage;
import com.qa.registration.pages.LoginPage;
import com.qa.registration.utility.ElementUtill;

public class LoginPageTest extends BaseTest {

	@Test
	public void Login() {
//		accPage = LoginPg.doLogin("dipalikaphare.dk@gmail.com", "Bekind@1995");
		accPage = LoginPg.doLogin(prop.getProperty("Username"),prop.getProperty("Password")  );
	}

	

}
