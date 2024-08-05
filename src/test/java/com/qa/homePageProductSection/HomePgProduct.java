package com.qa.homePageProductSection;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.registration.base.BaseTest;

public class HomePgProduct extends BaseTest {

//	@Parameters("SearchKey")
	@Test
	public void SearchProduct() {
		HP.productClick(prop.getProperty("SearchKey"));

	}
	
	
}
