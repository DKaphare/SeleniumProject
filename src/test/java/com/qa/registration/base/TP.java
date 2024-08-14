package com.qa.registration.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TP {

	WebDriver driver;
	
	@BeforeTest
	public void BT() {
		String browserName="chrome";
		switch (browserName) {
		case "chrome":
			driver=new ChromeDriver();
			driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
			break;

		default:
			break;
		}
		
	}
	
	
	@Test
	public void T() {
		String T=driver.getTitle();
		System.out.println(T);
	}
	@AfterTest
	public void AT() {
		System.out.println("Execution Complete");
	}
}

