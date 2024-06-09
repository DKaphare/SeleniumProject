package com.qa.registration.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import com.qa.registration.constants.AppConstants;
import com.qa.registration.utility.ElementUtill;
import com.qa.registration.utility.ExcelUtill;

public class NLogin {

	WebDriver driver;
	private ElementUtill eleUtill;

	By Email = By.id("input-email");
	By Pwd = By.id("input-password");
	By LoginButton = By.xpath("//input[@value='Login']");

	public NLogin(WebDriver driver) {
		this.driver = driver;
		eleUtill = new ElementUtill(driver);
	}

	public void Login(String EValue, String pwd2) {
		eleUtill.doSendKeys(Email, EValue);
		eleUtill.doSendKeys(Pwd, pwd2);
	}

	public void LoginButton() {
		eleUtill.doClick(LoginButton);
	}
}