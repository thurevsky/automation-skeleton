package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import managers.WebDriverManager;

public class Hooks {
	private static WebDriver driver;
	private static WebDriverWait wait;
	private WebDriverManager webDriverManager;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static WebDriverWait getWait() {
		return wait;
	}
	
	@Before
	public void initializeTest() {
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
