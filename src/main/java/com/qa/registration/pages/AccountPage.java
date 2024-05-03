package com.qa.registration.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.qa.registration.utility.ElementUtill;

public class AccountPage {

	private WebDriver driver;
	private ElementUtill eleUtill;
	private By search= By.name("search");
	private By searchIcon=By.xpath("//span[@class='input-group-btn']");
	
	
	private By header= By.cssSelector("div#content h2");
	
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		eleUtill= new ElementUtill(driver);
	}
	
	
	public void getTitle(String name,int TimeOut) {
		String Tit=driver.getTitle();
		System.out.println(Tit);
	}
	
	
	public List<String> getHeader() {
		List<WebElement> headerList= driver.findElements(header);
		List<String> headerValueList=new ArrayList<String>();
		for(WebElement e:headerList) {
			String header= e.getText();
			System.out.println(header);
			
		}
		return headerValueList;
	}
	
	
	public SearchProduct Search(String searchKey) throws InterruptedException 
	{
		eleUtill.doSendKeys(search, searchKey);
//		eleUtill.clearElement(search);
		eleUtill.doClick(searchIcon);
		
		return new SearchProduct(driver);
	}
	
	
}
