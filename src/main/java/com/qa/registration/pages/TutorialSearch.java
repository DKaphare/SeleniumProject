package com.qa.registration.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.registration.utility.ElementUtill;

public class TutorialSearch {

	
	private WebDriver driver;
	private ElementUtill eleUtill;
	
	By SQL= By.xpath("//div[@class='library-nav__container']//a");
	
	public TutorialSearch( WebDriver driver) 
	{
		this.driver=driver;
		eleUtill=new ElementUtill(driver);
	}

	public void Headers(String Text) {
		eleUtill.clickOnElements(SQL, Text);
		eleUtill.doClick(SQL);
	}
}
