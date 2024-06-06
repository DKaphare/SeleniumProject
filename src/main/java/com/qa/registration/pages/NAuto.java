package com.qa.registration.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.registration.utility.ElementUtill;

public class NAuto {

	WebDriver driver;
	private ElementUtill eleUtill;

	private By fName = By.id("input-firstname");
	private By lName = By.id("input-lastname");
	private By emailId = By.id("input-email");
	private By Tel = By.id("input-telephone");
	private By pwd = By.id("input-password");
	private By cPwd = By.id("input-confirm");
	private By PPBox = By.xpath("//input[@type='checkbox']");
	private By con = By.xpath("//input[@value='Continue']");
	
	public NAuto(WebDriver driver) {
		this.driver = driver;
		eleUtill = new ElementUtill(driver);
	}
	public void NAutoRegPg(String value) {
		
		eleUtill.doActionsSendKeys(fName, value);
	}
	
}
