package com.qa.registration.utility;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Method are doclick, doSendkeys,getElement,getText
 *
 */
public class ElementUtill {

	private  WebDriver driver; // not making static coz, static means 1 copy and can not do parallel execution
										// then
	// for practice we can do not in utility

	
	public ElementUtill(WebDriver driver) {
		this.driver = driver;
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doSendKeys(By locator, String values) {

		if (values == null) {
			System.out.println("Values can not be null");
//				throw new FRAMEWORKEXCEPTION("VALUECANNOTBENULL");
		}
		getElement(locator).sendKeys(values);
	}

	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public String getText(By locator) {
//			return driver.findElement(locator).getText();	
		return getElement(locator).getText();
	}

	public boolean checkElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

//		public static String getElementAttribute(By locator,String Attribute) {
//			return getElement(locator).getAttribute(Attribute);
//		}

	public boolean checkElementDisable(By locator) {
		String disableStatus = getElement(locator).getAttribute("Disabled");
		if (disableStatus.equals(true)) {
			return true;
		}
		return false;
	}
	// return getElement(locator).isEnabled();

	public boolean checkElementEnable(By locator) {

		return getElement(locator).isEnabled();
	}

	public  void clickOnElements(By locator, String linkText) {

		List<WebElement> list = driver.findElements(locator);
		System.out.println("total no of links" + list.size());

		for (WebElement e : list) {
			String text = e.getText();
			if (text.equals(linkText)) {
				e.click();
				break;
			}

		}
	}

	public void LinkClick(By searchKeyword, String searchKey, String Keyword, By SearchLocator)
			throws InterruptedException {
		doSendKeys(searchKeyword, searchKey);
		Thread.sleep(5000);
		List<WebElement> List = driver.findElements((SearchLocator));
		System.out.println(List.size());

		for (WebElement e : List) {
			String text = e.getText();

			System.out.println(text);
			if (text.contains(Keyword))
				;
			e.click();
			break;
		}

	}
	// --------------------------> Select
	// class---------------------------------------------->

	public  void doActionsSendkeys(By locator) {
		Actions A = new Actions(driver);
		A.moveToElement(getElement(locator)).perform();
	}

	public  void doActionslick(By locator) {
		Actions A = new Actions(driver);
		A.moveToElement(getElement(locator)).perform();
	}

	public  void TwolevelHandling(By level1, By level2) throws InterruptedException {
		Actions A = new Actions(driver);
		A.moveToElement(getElement(level1)).build().perform();
		Thread.sleep(2000);
		getElement(level2).click();

	}

	public  void rightClick(String string) {
		Actions A = new Actions(driver);
		By optionocator = By.xpath("//li[@class='nav-item']/a[text()='" + string + "']");
		A.moveToElement(driver.findElement(optionocator)).build().perform();
	}

	public void dragAndDropmethod(By dragLocator, By dropLocator) {

		Actions a = new Actions(driver); // VImp->we need to create webelement and driver.findelement

		a.dragAndDrop(getElement(dragLocator), getElement(dropLocator));
	}

	// ------------------------Wait Utilly Started--------------------------------/
	public  WebElement waitPresenceOfElement(By Uname, int Time) {
		WebDriverWait WD = new WebDriverWait(driver, Duration.ofSeconds(Time));
		return WD.until(ExpectedConditions.presenceOfElementLocated(Uname));
	}

	public  String waitGetTitle(String titileValue, int timeOut) {
		WebDriverWait WD1 = new WebDriverWait(driver, Duration.ofSeconds(10));

		if (WD1.until(ExpectedConditions.titleContains(titileValue))) {
			return driver.getTitle();
		} else {
			System.out.println(titileValue + "Value is not present");
			return null;
		}
	}

	public  void waitForFrameByLocator(By Locator, int Timeout) {
		WebDriverWait WD3 = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
		WD3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(Locator)));
	}

	public  void waitListElement(By Locator, int TimeOut) {
		WebDriverWait WD5 = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
		List<WebElement> optionsList = WD5.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Locator));
		System.out.println(optionsList.size());
	}

	public  void waitForElementsVisible(By Locator, int TimeOut) {
		WebDriverWait WD6 = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
		List<WebElement> optionsList = WD6.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Locator));
		System.out.println(optionsList.size());
		String name = optionsList.toString();
		System.out.println(name);
	}

	public  void clickelementwhenReady(By locator, int TimeOut) {
		WebDriverWait WD1 = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
		WD1.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	public  void clearElement(By locator) {
		getElement(locator).clear();
	}
	public List<WebElement> waitForElementVisible1(By locator, int TimeOut) {
		WebDriverWait WD1 = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
		return (List<WebElement>) WD1.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
		public List<WebElement> waitForElementVisibleNotListUsing(By locator, int TimeOut) {
			WebDriverWait WD1 = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
			return (List<WebElement>) WD1.until(ExpectedConditions.visibilityOfElementLocated(locator));
					}
	

	public Boolean waitFortextToBePresent(By locator, String text, int TimeOut) {
		WebDriverWait WD1 = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
		return WD1.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));

	}
//--------------------------Naveen-Registration-Page-ErrorCapture------------------------------

	public String toCheckError(By locator, String ActualText) {

		List<WebElement> Errorlist = driver.findElements(locator);
//		System.out.println("total no of Error" + Errorlist.size());

		int count = 0;
		for (WebElement e : Errorlist) {
			String text = e.getText();
			if (text.equals(ActualText)) {
				System.out.println("Error Matched ");
			}
			count++;
		}
		return ActualText;

	}
}
