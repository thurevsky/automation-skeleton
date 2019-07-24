package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	private WebDriver driver = Hooks.getDriver();
	
	@Given("^I am on the page on URL \"([^\"]*)\"$")
	public void i_am_on_the_page_on_URL(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@Then("^I should see \"([^\"]*)\" on title$")
	public void i_should_see_on_title(String arg1) throws Throwable {
		System.out.println("\"" + driver.getTitle() + "\"");
		System.out.println("\"" + arg1 + "\"");
		if(driver.getTitle() != arg1) throw new Exception();
	}

	@When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_fill_in_with(String arg1, String arg2) throws Throwable {
		System.out.println("I fill in " + arg1 + " with " + arg2);
	}

	@When("^click on \"([^\"]*)\" button$")
	public void click_on_button(String arg1) throws Throwable {
		System.out.println("click on" + arg1 + " button");
	}
}
