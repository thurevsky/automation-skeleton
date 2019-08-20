package dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;

public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath = "configs//Configuration.properties";
	
	public ConfigFileReader() {
		BufferedReader reader;
		
		// Load property file
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			
			try {
				properties.load(reader);
				reader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration not found at "+ propertyFilePath);
		}
	}
	
	public String getDriverPath(DriverType driverType) {
		String propKey = null;
		
		if(driverType == DriverType.CHROME)
			propKey = "chromeDriverPath";
		else if(driverType == DriverType.FIREFOX)
			propKey = "firefoxDriverPath";
		else if(driverType == DriverType.INTERNETEXPLORER)
			propKey = "internetexplorerDriverPath";
		
		String driverPath = properties.getProperty(propKey);
		
		if(driverPath != null) 
			return driverPath;
		else
			throw new RuntimeException(propKey + " is not configured in the Configurations.properties file");
	}
	
	public int getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null)
			return Integer.parseInt(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait is not configured in the Configurations.properties file");
	}
	
	public String getAppUrl() {
		String appUrl = properties.getProperty("appUrl");
		if(appUrl != null)
			return appUrl;
		else
			throw new RuntimeException("appUrl is not configured in the Configurations.properties file");
	}
	
	public DriverType getBrowser() {
		String browser = properties.getProperty("browser");
		if(browser != null) {
			if(browser.compareToIgnoreCase("chrome") == 0)
				return DriverType.CHROME;
			else if(browser.compareToIgnoreCase("firefox") == 0)
				return DriverType.FIREFOX;
			else // browser.compareToIgnoreCase("internetexplorer") == 0
				return DriverType.INTERNETEXPLORER;
		}else
			throw new RuntimeException("browser is not configured in the Configurations.properties file");
	}
	
	public boolean getStartMaximized() {
		String startMaximized = properties.getProperty("startMaximized");
		if(startMaximized != null) {
			if(startMaximized.compareToIgnoreCase("true") == 0)
				return true;
			else
				return false;
		}else
			throw new RuntimeException("startMaximized is not configured in the Configurations.properties file");
	}
}
