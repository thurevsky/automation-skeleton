package pageObjectFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	final WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//input[@name='q']")
	public WebElement txt_Query;
	
	@FindBy(how = How.XPATH, using = "//input[@name='btnK']")
	public WebElement btn_Search;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
}
