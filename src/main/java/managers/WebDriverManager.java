package managers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.DriverType;

public class WebDriverManager {
	private WebDriver driver;
	private static DriverType driverType;
	private FileReaderManager fileReaderManager = FileReaderManager.getInstance();
	
	public WebDriverManager() {
		driverType = fileReaderManager.getConfigReader().getBrowser();
	}
	
	public WebDriver getDriver() {
		if(driver == null)
			driver = createDriver();
		
		return driver;
	}
	
	private WebDriver createDriver() {
		// Create driver instance
		MutableCapabilities driverOptions;
		
		switch(driverType) {
		case CHROME:{
			System.setProperty("webdriver.chrome.driver", fileReaderManager.getConfigReader().getDriverPath(DriverType.CHROME));
			List<String> driverArguments = new ArrayList();
			driverArguments.add("--log-level=3");
			
			driverOptions = new ChromeOptions();
			((ChromeOptions)driverOptions).addArguments(driverArguments);
			driver = new ChromeDriver((ChromeOptions)driverOptions);
			break;
		}
		case FIREFOX:{
			System.setProperty("webdriver.gecko.driver", fileReaderManager.getConfigReader().getDriverPath(DriverType.FIREFOX));
			driver = new FirefoxDriver();
			break;
		}
		case INTERNETEXPLORER:{
			System.setProperty("webdriver.iexplore.driver", fileReaderManager.getConfigReader().getDriverPath(DriverType.INTERNETEXPLORER));
			driver = new InternetExplorerDriver();
			break;
		}
		}
		
		// Set maximized
		if(fileReaderManager.getConfigReader().getStartMaximized())
			driver.manage().window().maximize();
		
		// Set implicitly wait
		driver.manage().timeouts().implicitlyWait(fileReaderManager.getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		
		return driver;
	}
	
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
}
