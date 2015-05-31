package com.vaani.logger.main;

import com.vaani.logger.*;
import com.vaani.logger.impl.LoggerProvider;

public class LoggerMain {
	Logger log;
	public LoggerMain() throws Exception{
		
		 log = LoggerProvider.getLogger(this.getClass());
	}
	

	public void doSomething(){
		log.log(LogLevel.DEBUG, "Doing something");
	}
	
	public void doSomethingFail(){
		log.log(LogLevel.SEVERE, "Cannot do anything");
	}
	
	public void trySomething(){
		log.log(LogLevel.INFO, "Doing something");
	}
	public static void main(String[] args) throws Exception{
		LoggerMain lm = new LoggerMain();
		lm.doSomething();
		lm.trySomething();
		lm.doSomethingFail();
		
	}
}
