package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Log;

public class HomePageStepDefs {
	private WebDriver driver = Hooks.getDriver();
	private pageObjectFactories.HomePage facHomePage;
	private Log logger;
	
	public HomePageStepDefs() {
		this.facHomePage = PageFactory.initElements(driver, pageObjectFactories.HomePage.class);
		logger = new Log(this.getClass());
	}
	
	@When("^User fills in \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_fill_in_with(String arg1, String arg2) throws Throwable {
		
		switch(arg1) {
		case "Query Text Box":
		{
			facHomePage.txt_Query.sendKeys(arg2);
			break;
		}
		}
		
		logger.info(arg1 + " filled with " + arg2);
	}

	@When("^User clicks on \"([^\"]*)\" button$")
	public void click_on_button(String arg1) throws Throwable {
		
		switch(arg1) {
		case "Search":{
			facHomePage.btn_Search.click();
			break;
		}
		}
		
		logger.info(arg1 + " clicked succesfully");
	}
}
