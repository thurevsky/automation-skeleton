package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.*;

public class HomePageStepDefs {
	private WebDriver driver = Hooks.getDriver();
	private Logger logger = Hooks.getLogger();
	private WebDriverWait wait = Hooks.getWait();
	
	@Given("^I am on the page on URL \"([^\"]*)\"$")
	public void i_am_on_the_page_on_URL(String arg1) throws Throwable {
		driver.get(arg1);
		logger.info("PASS - Loaded " + arg1 + " succesfully");
	}

	@Then("^I should see \"([^\"]*)\" on title$")
	public void i_should_see_on_title(String arg1) throws Throwable {
		wait.until(ExpectedConditions.titleIs(arg1));
		logger.info("PASS - String " + arg1 + " detected succesfully");
	}
	
	@Then("^I should see \"([^\"]*)\" or \\\"([^\\\"]*)\\\" on title$")
	public void i_should_see_or_on_title(String arg1, String arg2) throws Throwable {
		wait.until(ExpectedConditions.or(ExpectedConditions.titleIs(arg1), ExpectedConditions.titleIs(arg2)));
		logger.info("PASS - String " + arg1 + " or " + arg2 + " detected succesfully");
	}

	@When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_fill_in_with(String arg1, String arg2) throws Throwable {
		
		switch(arg1) {
		case "Query Text Box":
		{
			wait.until(ExpectedConditions.visibilityOf(HomePage.txt_Query(driver)));
			HomePage.txt_Query(driver).sendKeys(arg2);
		}
		}
	}

	@When("^click on \"([^\"]*)\" button$")
	public void click_on_button(String arg1) throws Throwable {
		
		switch(arg1) {
		case "Search":{
			wait.until(ExpectedConditions.visibilityOf(HomePage.btn_Search(driver)));
			HomePage.btn_Search(driver).click();
			logger.info("PASS - " + arg1 + " clicked succesfully");
		}
		}
	}
}
