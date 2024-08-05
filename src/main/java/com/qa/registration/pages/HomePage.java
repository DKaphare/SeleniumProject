package com.qa.registration.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.registration.utility.ElementUtill;

public class HomePage {

	private WebDriver driver;
	private ElementUtill ele;

	
	By Product= By.xpath("//a[@href='/products']");
	By SearchBox= By.id("search_product");
	By SearchIcon=By.id("submit_search");
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		ele = new ElementUtill(driver);
	}

   


	public void productClick(String SearchKey) {
		ele.doClick(Product);
		ele.doSendKeys(SearchBox, SearchKey);
		ele.doClick(SearchIcon);
	}
	
}
