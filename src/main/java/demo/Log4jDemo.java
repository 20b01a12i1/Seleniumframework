package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	static {
        // Set the log4j.configurationFile system property
        System.setProperty("log4j.configurationFile", "file:log4j.properties");
    }

	
	static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("\n Logs message started \n");
		logger.trace("Trace message");
		logger.debug("Debug message");
		logger.info("this is info message");
		logger.warn("Warn message");
		logger.fatal("This is a fatal message");
		logger.error("Error message");
		System.out.println("\n completed \n");
//		System.out.println("Log4j2 Configuration Location: " + System.getProperty("log4j.configurationFile"));

		
	}
}
