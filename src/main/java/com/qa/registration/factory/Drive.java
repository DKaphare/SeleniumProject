package com.qa.registration.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drive {

	WebDriver driver;
	Properties prop;
	OptionsManager ops;

	public WebDriver initDriver(Properties prop) {
		String browserName = prop.getProperty("browser");

		OptionsManager ops = new OptionsManager(prop);

		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver(ops.getChomeOptions());
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			driver = new EdgeDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//	driver.get("https://www.orangehrm.com/");
		driver.get(prop.getProperty("URL"));
		return driver;

	}

	public Properties initProp() {
		FileInputStream ip = null;
		prop = new Properties();
		try {
			ip = new FileInputStream("./src\\main\\resource\\config\\config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(ip); // Here er r loading all the data from config.properites
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}
