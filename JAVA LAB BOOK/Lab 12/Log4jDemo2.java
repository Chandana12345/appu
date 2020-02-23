package lab12;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import labbean.Message;

public class Log4jDemo2
{
	static Logger log=LogManager.getLogger(Message.class.getName());
   //create a logger for Log4jDemo2 class

    public static void main(String args[])
    {

        for(int i=1 ; i<50000; i++)
        {
           System.out.println("Counter = " + i);
           log.debug("This is my debug message. Counter = " + i);
           log.error("error message");
       	   log.info("info message");
       	   log.warn("warning message");
       	   log.fatal("fatal message");
       	   
           // write log message statements for remaining priority levels 
		  //in the same way
            }
      }
}
