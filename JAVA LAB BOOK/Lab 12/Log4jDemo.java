package lab12;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jDemo {

  //create a logger for Log4jDemo class
	static Logger logger=LogManager.getLogger(Log4jDemo.class.getName());

public static void main(String args[]) {

  // create log messages for each priority level
	logger.error("logged");
	logger.debug("not logger");
	logger.info("log info");
	logger.warn("warning");
	logger.fatal("system fatal");
	
      }
}

