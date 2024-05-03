package com.qa.registration.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.registration.base.BaseTest;

public class ProductInfoTest extends BaseTest{
	
	@BeforeClass
	public void productInforSteup() {
		accPage= LoginPg.doLogin(prop.getProperty("Username"),prop.getProperty("Password")  );
	}
	
	@Test(priority=1)
	public void productHeaderTest() throws InterruptedException  {
		
		SerchProd=accPage.Search("MAC");
//		SerchProd.getAccPageHeadeCount();
		info=SerchProd.K("MACBOOK PRO");
//		String HeaderVal=	info.getProdHeader();
//		System.out.println(HeaderVal);
	}
	
	/*
    @Test
	public void productImageCountTest() throws InterruptedException  {
		
		SerchProd=accPage.Search("MAC");
		SerchProd.getAccPageHeadeCount();
		info=SerchProd.K("MACBOOK PRO");
		int HeaderCount=info.getProductImageCount();
			System.out.println(HeaderCount);
	}
	
	@Test
	public void prodCountTest() {
		info.getProductImageCount();
	}
*/

	
	
	@Test(priority=2)
	public void getTitleProductInfo()
{
	info.getTitle();
		
}	                          
}