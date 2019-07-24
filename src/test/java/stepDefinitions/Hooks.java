package stepDefinitions;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	private static WebDriver driver; 
	private static Logger logger = LogManager.getLogger("logger");
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static Logger getLogger() {
		return logger;
	}
	
	@Before
	public void initializeTest() {
		// Init logger
		BasicConfigurator.configure();
		
		// Init driver
		System.setProperty("webdriver.chrome.driver", "extbin/chromedriver");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		// Quit driver
		driver.quit();
	}
}
