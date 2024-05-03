package com.qa.registration.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.registration.utility.ElementUtill;

public class LoginPage {

	private WebDriver driver;
	private ElementUtill eleUtill;
	
	private By Username= By.cssSelector("input#input-email");
	private By pwd= By.cssSelector("input#input-password");
	private By loginButton= By.xpath("//input[@value='Login']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		eleUtill= new ElementUtill(driver);
	}
	
	
	public AccountPage doLogin(String User, String PWD) {
		eleUtill.doSendKeys(Username, User);
		eleUtill.doSendKeys(pwd, PWD);
		eleUtill.doClick(loginButton);
		return new AccountPage(driver);
		
	}	
	
	
	
	
		
		
	}

