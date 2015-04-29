package com.vaani.maven.maventry;

import org.apache.log4j.Logger;

public class Log4JHello{
	 
	final static Logger logger = Logger.getLogger(Log4JHello.class);
 
	public static void main(String[] args) {
 
		Log4JHello obj = new Log4JHello();
		obj.runMe("mkyong");
 
	}
 
	private void runMe(String parameter){
 
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
 
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}
 
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
 
	}
 
}