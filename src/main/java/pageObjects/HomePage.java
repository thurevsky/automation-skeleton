package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static WebElement txt_Query(WebDriver driver){
		return driver.findElement(By.xpath("//input[@name='q']"));
	}
	
	public static WebElement btn_Search(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='btnK']"));
	}
}
