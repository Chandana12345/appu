package lab12;

import labbean.Message;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

   public class Log4jDemo3 
   {

    //create a logger for Log4jDemo3 class
	static Logger logger=LogManager.getLogger(Log4jDemo3.class.getName());

     public static void main(String args[]) 
     {
    	 

             //create an instance of Message class
	         @SuppressWarnings("unused")
			Logger log=Logger.getLogger("Message");
	         Message m=new Message();
             //call setMessage() method
	         m.setMessage("msg");
	         
             //print the log messages using getMessage() method
	         m.getMessage();
	
             // write log message statements for each priority level
	         logger.error("logged");
	         logger.debug("not logger");
	         logger.info("log info");
	         logger.warn("warning");
	         logger.fatal("system fatal");
      }
}

