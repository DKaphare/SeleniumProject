package com.qa.registration.pages;

import java.util.HashMap;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.registration.utility.ElementUtill;

public class CRMLogin {

	WebDriver driver;
	ElementUtill ele;
	
	private By Uname=By.id("input-email");
	private By Pwd= By.id("input-password");
	
	
	public CRMLogin(WebDriver driver) {
		this.driver=driver;
		ele = new ElementUtill(driver);
	}
	
	public HashMap<String, String> getCred() {
		HashMap<String, String> HP=new HashMap<String,String>();
		HP.put("Customer", "dipalikaphare.dk@gmail.com:Bekind@1995");
		HP.put("Seller", "Girija:123");
		HP.put("DeliveryBoy", "Pappu:123");
		
		String Cred=HP.get("Customer");
//		driver.findElement(Uname).sendKeys(Cred.split(":")[0]);
//		driver.findElement(Pwd).sendKeys(Cred.split(":")[1]);
		ele.doSendKeysArray(Uname, Cred.split(":")[0]);
		ele.doSendKeysArray(Uname, Cred.split(":")[1]);
		return HP;
		
	}
}
