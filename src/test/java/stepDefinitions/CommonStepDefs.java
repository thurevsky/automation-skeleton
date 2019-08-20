package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import managers.FileReaderManager;

public class CommonStepDefs {
	private WebDriver driver = Hooks.getDriver();
	private Logger logger = Hooks.getLogger();
	private FileReaderManager fileReaderManager = FileReaderManager.getInstance();
	private WebDriverWait wait = Hooks.getWait();
	
	@Given("^User was on the homepage$")
	public void user_was_on_the_homepage() {
		driver.get(fileReaderManager.getConfigReader().getAppUrl());
	}
	
	@Given("^User am on the page on URL \"([^\"]*)\"$")
	public void user_am_on_the_page_on_URL(String arg1) throws Throwable {
		driver.get(arg1);
		driver.manage().window().maximize();
		logger.info("PASS - Loaded " + arg1 + " succesfully");
	}
	
	@Then("^User should see \"([^\"]*)\" on title$")
	public void user_should_see_on_title(String arg1) throws Throwable {
		wait.until(ExpectedConditions.titleIs(arg1));
		logger.info("PASS - String " + arg1 + " detected succesfully");
	}
	
	@Then("^User should see \"([^\"]*)\" or \\\"([^\\\"]*)\\\" on title$")
	public void user_should_see_or_on_title(String arg1, String arg2) throws Throwable {
		wait.until(ExpectedConditions.or(ExpectedConditions.titleIs(arg1), ExpectedConditions.titleIs(arg2)));
		logger.info("PASS - String " + arg1 + " or " + arg2 + " detected succesfully");
	}
	
//	@Then("User should be on \"([^\"]*)\" page")
//	public void user_should_be_on_page(String arg1) throws Throwable {
//		switch(arg1) {
//		case "My Account":{
//			wait.until(ExpectedConditions.titleIs(arg1));
//		}
//		}
//		
//		logger.info("PASS - String " + arg1 + " detected succesfully");
//	}
}
