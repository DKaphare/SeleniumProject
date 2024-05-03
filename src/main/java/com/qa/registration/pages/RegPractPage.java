package com.qa.registration.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegPractPage {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		By error=By.xpath("//div[@class='text-danger']");
		
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(2000);
		toCheckError(error);
	}		
		
	/*
	 * locator->in list i will captuer the error
	 * then 1 by 1 i will assert with my actual error
	 */
	public static void toCheckError(By locator) {
		List<WebElement> Errorlist = driver.findElements(locator);
			System.out.println("total no of Error" + Errorlist.size());

			int count=0;
			for (WebElement e : Errorlist) {
				String text = e.getText();
				System.out.println(text);
//				if (text.equals(linkText)) {
//					e.click();
					
				}
			count++;
		}

	

}
