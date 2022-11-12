package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {

	private static WebDriver driver;

	private static SeleniumDriver seleniumDriver;

	private static FileInputStream fis;

	private static Properties config = new Properties();

	private static Properties OR = new Properties();

	private static WebDriverWait explicitWait;

	private SeleniumDriver() {
		try {
			fis = new FileInputStream("./src/main/resources/properties/Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			config.load(fis);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			fis = new FileInputStream("./src/main/resources/properties/OR.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			OR.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (config.getProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (config.getProperty("browser").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicitWait"))));

		explicitWait = new WebDriverWait(driver,
				Duration.ofSeconds(Integer.parseInt(config.getProperty("explicitWait"))));

	}

	public static void setupDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}

	}

	public WebDriver getDriver() {
		return driver;
	}

	public static void goTo(String url) {
		driver.get(url);
	}

	public static void teadDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}

}