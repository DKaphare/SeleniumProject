package com.qa.registration.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.registration.pages.NAuto;
import com.qa.registration.pages.NLogin;
import com.qa.registration.pages.RegistrPage;


import com.qa.registration.utility.ElementUtill;

public class BaseTest1 {

	WebDriver driver;
	protected RegistrPage RP;
	protected ElementUtill eleUtill;
	protected NAuto NAG;
	protected NLogin NL;

//	@Parameters({"Browser","URL"})

	@BeforeTest
	public void setup() {
		String browserName = "chrome";
		switch (browserName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//	NAG   = new NAuto (driver);
			NL	=new NLogin(driver);
			
			break;
		case "edge":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new ChromeDriver();
			break;
		default:
			System.out.println("Please pass the right browser");
			break;
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@AfterTest
	public void TearDown() {

	}
}
