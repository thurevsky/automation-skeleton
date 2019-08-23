package utils;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log {
	private Logger log;
	
	public Log(Class classObject) {
		DOMConfigurator.configure("log4j.xml");
		log = Logger.getLogger(classObject.getName());
	}
	
	public void startTestCase(String testCaseName) {
		log.info("****************************************************************************************");
		log.info("****************************************************************************************"); 
		log.info("$$$$$$$$$$$$$$$$$$$$$                 "+testCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$"); 
		log.info("****************************************************************************************"); 
		log.info("****************************************************************************************");
	}
	
	public void endTestCase(String testCaseName) {
		log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
		log.info("X");
		log.info("X");
		log.info("X");
		log.info("X");
	}
	
	/*Bypassing to log4j*/
	public void info(String message) {
		log.info(message); 
	}
		 
	public void warn(String message) {
		log.warn(message);
	}
		 
	public void error(String message) {
		log.error(message);
	}
		 
	public void fatal(String message) {
		log.fatal(message);
	}
		 
	public static void debug(String message) {
		Log.debug(message);
	}
}
