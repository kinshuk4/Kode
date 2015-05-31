package com.vaani.logger.impl;

import java.io.IOException;
import java.util.Properties;

public class LoggerProperties {
	Properties properties;
	
	public LoggerProperties(String file) {
		Properties properties = new Properties();
		try {
			properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(file));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
