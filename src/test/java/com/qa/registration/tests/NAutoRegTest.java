package com.qa.registration.tests;

import org.testng.annotations.Test;

import com.qa.registration.base.BaseTest1;

public class NAutoRegTest extends BaseTest1 {

	
	@Test
	public void doReg() {
		NAG.NAutoRegPg("Dipali");
	}
}
