package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefs {
	private WebDriver driver = Hooks.getDriver();
	private Logger logger = Hooks.getLogger();
	private WebDriverWait wait = Hooks.getWait();
	private pageObjectFactories.HomePage facHomePage;
	
	public HomePageStepDefs() {
		this.facHomePage = PageFactory.initElements(driver, pageObjectFactories.HomePage.class);
	}
	
	@When("^User fills in \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_fill_in_with(String arg1, String arg2) throws Throwable {
		
		switch(arg1) {
		case "Query Text Box":
		{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.txt_Query));
			facHomePage.txt_Query.sendKeys(arg2);
		}
		}
	}

	@When("^User clicks on \"([^\"]*)\" button$")
	public void click_on_button(String arg1) throws Throwable {
		
		switch(arg1) {
		case "Search":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.btn_Search));
			facHomePage.btn_Search.click();
			logger.info("PASS - " + arg1 + " clicked succesfully");
		}
		}
	}
}
