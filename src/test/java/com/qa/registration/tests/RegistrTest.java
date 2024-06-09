package com.qa.registration.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.registration.base.BaseTest;
import com.qa.registration.base.BaseTest1;
import com.qa.registration.constants.AppConstants;

public class RegistrTest extends BaseTest1 {

	@Test
	public void RegPageURL() {
		String actRegtitle = RP.getTitle();
		Assert.assertEquals(actRegtitle, AppConstants.REGISTER_PAGE_TITLE);
	}

	@Test
	public void doRegistration(String FValuee) {
	RP.doRegistrationPg("Dipali");
	}
	
	@Test
	public void doregClick() {
		RP.doClick();
	}
}
