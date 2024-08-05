package com.qa.registration.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.registration.utility.ElementUtill;

public class Images {

	private WebDriver driver;
	private ElementUtill ele;

	By Imglinks = By.tagName("img");

	public Images(WebDriver driver) {
		this.driver = driver;
		ele = new ElementUtill(driver);
	}

	public void LinksList() {
		List<WebElement> Img= driver.findElements(Imglinks);
		
		for(WebElement e:Img) {
			String text= e.getText();
			System.out.println(e.getSize());
			System.out.println(text);
		}
		
	
	}
}
