package com.qa.registration.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	WebDriver driver;
	Properties prop;

	public WebDriver initDriver(Properties prop) {
		String browserName = prop.getProperty("Browser");
		System.out.println("Browser name is " + browserName);
		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Please pass the right browser" + browserName);
			break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.get(prop.getProperty("URL"));
//	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		
		return driver;

	}

	public Properties initProp() {
		FileInputStream ip = null;
		prop = new Properties();
		
		
		String envName = System.getProperty("env");
		System.out.println("env name is " + envName);

		try {
			if (envName == null) {
				System.out.println("no env is given");
				ip = new FileInputStream(
						"C:\\Users\\HP\\eclipse-workspace\\TutorialsPoint\\src\\main\\resource\\config\\configTP.properties");
			} else {
				switch (envName.toLowerCase().trim()) {
				case "qa":
					ip = new FileInputStream(
							"C:\\Users\\HP\\eclipse-workspace\\POM_Series\\src\\main\\resource\\config\\config.properties");
					break;
				case "uat":
					ip = new FileInputStream(
							"C:\\Users\\HP\\eclipse-workspace\\POM_Series\\src\\main\\resource\\config\\uat.config.properties");
					break;
				default:
					System.out.println("Please paas the right browser");
					break;
				}
			}
			prop.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}

	/*	try {
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\HP\\eclipse-workspace\\POM_Series\\src\\main\\resource\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		return prop;
	}

}
