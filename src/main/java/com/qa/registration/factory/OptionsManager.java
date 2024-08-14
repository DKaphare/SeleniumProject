package com.qa.registration.factory;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class OptionsManager {

	private Properties prop;

	private ChromeOptions co;
	private EdgeOptions eo;

	public OptionsManager(Properties prop) {
		this.prop = prop;
	}

	public ChromeOptions getChomeOptions() {
		co = new ChromeOptions();
		if (Boolean.parseBoolean(prop.getProperty("headless")))
			;
		{
			co.addArguments("--headless=new");// in config.properties file everything is in String
		}
		if (Boolean.parseBoolean(prop.getProperty("incognito")))
			;
		{
			co.addArguments("--incoginto");// in config.properties file everything is in String
		}
		return co;
	}
}
