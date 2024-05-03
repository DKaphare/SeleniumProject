package com.qa.registration.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.registration.base.BaseTest;
import com.qa.registration.pages.AccountPage;
import com.qa.registration.pages.SearchProduct;

public class AccountPageTest extends BaseTest{

	
	@BeforeClass
	public void accPageSetup() {
		accPage=LoginPg.doLogin(prop.getProperty("Username"),prop.getProperty("Password")  );
	}
	
	
	@Test(priority = 1)
	public void Title() {
		
		accPage.getTitle("Search", 10);
	}
	
	@DataProvider
	public Object[][] seacrhData() {
		return new Object[][] { { "Macbook" }
		
		};
			
	}

	@Test(dataProvider = "seacrhData")
	public SearchProduct searchMAC(String searchKey) throws InterruptedException {
	return accPage.Search(searchKey);
		
	}
	
	@AfterClass()
	public void empty(){
		
	}
}
