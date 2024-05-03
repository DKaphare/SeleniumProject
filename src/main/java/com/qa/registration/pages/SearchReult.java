package com.qa.registration.pages;

import org.openqa.selenium.WebDriver;

import com.qa.registration.utility.ElementUtill;

public class SearchReult {

	private WebDriver driver;
	private ElementUtill eleUtill;
	
	public SearchReult(WebDriver driver) {
		this.driver=driver;
		eleUtill =new ElementUtill(driver);
		
	}

	
}
