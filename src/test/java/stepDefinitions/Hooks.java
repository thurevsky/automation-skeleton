package stepDefinitions;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import managers.WebDriverManager;

public class Hooks {
	private static WebDriver driver;
	private static WebDriverWait wait;
	private static Logger logger = LogManager.getLogger("logger");
	private WebDriverManager webDriverManager;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static Logger getLogger() {
		return logger;
	}
	
	public static WebDriverWait getWait() {
		return wait;
	}
	
	@Before
	public void initializeTest() {
		// Init logger
		BasicConfigurator.configure();
		
		// Init driver
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		
		// Init explicit wait
		wait = new WebDriverWait(driver, 10);
	}
	
	@After
	public void tearDown() {
		// Quit driver
		webDriverManager.closeDriver();
	}
}
