package com.qa.registration.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import com.qa.registration.constants.AppConstants;
import com.qa.registration.utility.ElementUtill;

public class productInfo {

	WebDriver driver;
	private ElementUtill eleUtill;
	
	private By productHeader=By.cssSelector("div.row h1");
	private By productImage= By.cssSelector("a.thumbnail img");
	private By quantity= By.name("quantity");
	private By addToCartBtn =By.id("button-cart");
	
	public productInfo(WebDriver driver)
	{
	this.driver=driver;
	eleUtill= new ElementUtill(driver);
	}

//	public String getProdHeader() {
//		String prodhead= eleUtill.getText(productHeader);
//		return prodhead;
//	}
//	
//	public int getProductImageCount() {
//		int ProductCount= eleUtill.waitForElementVisibleNotListUsing(productImage, AppConstants.MEDIUM_TME_OUT).size();
//		System.out.println("Total product images for "+ProductCount);	
//		return ProductCount;
//	}
//	
	public String getTitle()
	{
		String Tit= driver.getTitle();
		return Tit;  
	}
}
