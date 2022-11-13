package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumDriver;

public class BaseTest {

	public WebDriver driver;
	private WebElement mouseOverElement;
	private WebElement selectElement;

	public BaseTest() {
		driver = SeleniumDriver.getDriver();
	}

	public void click(String locator) {

		System.out.println("Click locator : " + SeleniumDriver.OR.getProperty(locator));

		if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).click();
		} else if (locator.endsWith("_ID")) {
			driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).click();
		} else if (locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).click();
		} else if (locator.endsWith("_LINK")) {
			driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator))).click();
		}

	}

	public void mouseOver(String locator) {

		System.out.println("Mouse Over locator : " + SeleniumDriver.OR.getProperty(locator));

		if (locator.endsWith("_XPATH")) {
			mouseOverElement = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator)));
		} else if (locator.endsWith("_ID")) {
			mouseOverElement = driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator)));
		} else if (locator.endsWith("_CSS")) {
			mouseOverElement = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator)));
		} else if (locator.endsWith("_LINK")) {
			mouseOverElement = driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator)));
		}

		new Actions(driver).moveToElement(mouseOverElement).perform();

	}
	
	
	public void sendValues(String locator, String vaules) {

		System.out.println("Mouse Over locator : " + SeleniumDriver.OR.getProperty(locator));

		if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).sendKeys(vaules);
		} else if (locator.endsWith("_ID")) {
			driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).sendKeys(vaules);
		} else if (locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).sendKeys(vaules);
		} else if (locator.endsWith("_LINK")) {
			driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator))).sendKeys(vaules);
		}

	}


	public void selectOptions(String locator, String option) {

		System.out.println("selectOptions locator : " + SeleniumDriver.OR.getProperty(locator));

		if (locator.endsWith("_XPATH")) {
			selectElement = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator)));
		} else if (locator.endsWith("_ID")) {
			selectElement = driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator)));
		} else if (locator.endsWith("_CSS")) {
			selectElement = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator)));
		} else if (locator.endsWith("_LINK")) {
			selectElement = driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator)));
		}

		Select selectOption = new Select(selectElement);

		selectOption.selectByVisibleText(option);
	}

	public String getElementText(String locator) {

		System.out.println("getElementText locator : " + SeleniumDriver.OR.getProperty(locator));

		if (locator.endsWith("_XPATH")) {
			locator = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).getText();
		} else if (locator.endsWith("_ID")) {
			locator = driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).getText();
		} else if (locator.endsWith("_CSS")) {
			locator = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).getText();
		} else if (locator.endsWith("_LINK")) {
			locator = driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator))).getText();
		}

		return locator;

	}

}
