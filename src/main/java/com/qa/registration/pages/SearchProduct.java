package com.qa.registration.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.registration.constants.AppConstants;
import com.qa.registration.utility.ElementUtill;

public class SearchProduct {

	private WebDriver driver;
	private ElementUtill eleUtill;

	By resultCount = By.cssSelector("div.product-layout");
	By productName=By.linkText("//a[text()='MacBook Air']");

	public SearchProduct(WebDriver driver) {
		this.driver = driver;
		eleUtill= new ElementUtill(driver);
	}

	public void getAccPageHeadeCount() {
		eleUtill.waitForElementVisible1(resultCount, AppConstants.MEDIUM_TME_OUT);
		eleUtill.doClick(productName);
	}

	public productInfo K (String productName) {
		return new productInfo(driver);
	}
}
