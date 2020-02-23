package lab12;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class HelloWorld { 
static final Logger logger = Logger.getLogger(HelloWorld.class);  
public static void main(String[] args) {         
PropertyConfigurator.configure("log4j.properties");
logger.debug("Hello World!");  
logger.warn("Sample warn message");    
logger.error("Sample error message");   
} 
}
