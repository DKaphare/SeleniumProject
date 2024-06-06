package com.qa.registration.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.registration.constants.AppConstants;
import com.qa.registration.utility.ElementUtill;

public class RegistrPage {

	WebDriver driver;
	private ElementUtill eleUtill;
	
	By FName= By.xpath("//input[@id=\"Form_getForm_FullName\"]");
	By Email= By.id("Form_getForm_Email");
	By CName=By.id("Form_getForm_Email");
	By PhNo= By.id("Form_getForm_Contact");
	By GetDemo=By.id("Form_getForm_action_submitForm");
	By BookDemo=By.xpath("//div[@class=\"d-flex web-menu-btn\"]//a[contains(@href,'free-demo')]");
	
	public RegistrPage(WebDriver driver) {
		this.driver=driver;
		eleUtill = new ElementUtill(driver);
	}
	
	public String getTitle(){
		String regTitle=eleUtill.waitForTitleIs(AppConstants.REGISTER_PAGE_TITLE, AppConstants.SHORT_TIME_OUT);
		return regTitle;
	}
	
	public void doRegistrationPg(String FValuee) {
		eleUtill.doClick(Email);
		eleUtill.doSendKeys(Email, FValuee);
		
		
	}
	
	public void doClick() {
		eleUtill.doClick(BookDemo);
		System.out.println("Click");
	}
}
