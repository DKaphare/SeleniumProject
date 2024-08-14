package com.qa.registration.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.registration.utility.ElementUtill;

public class CountResult {

	private WebDriver driver;
	private ElementUtill ele;

	By LinkCount=By.xpath("//div[@class='productinfo text-center']");
	
	
	

	public CountResult(WebDriver driver) {
		this.driver=driver;
		ele = new ElementUtill(driver);
	}



	public void result() {
	System.out.println("CountResult Run Successfully");
		
	}
	
	
	
}
