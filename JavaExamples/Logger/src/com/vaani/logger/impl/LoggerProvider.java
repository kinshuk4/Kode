package com.vaani.logger.impl;

import java.io.IOException;
import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

import com.vaani.logger.*;

public final class LoggerProvider {
	private static Properties properties;
	private static final String configFile = "LoggerOla.properties";

	private LoggerProvider() throws Exception {

	}

	private static HashMap<Class, Logger> loggers = new HashMap<Class, Logger>();

	public static Logger getLogger(Class clazz) throws Exception {
		if (properties == null || loggers == null) {
			properties = new Properties();

			InputStream input = null;

			input = new FileInputStream(configFile);

			// load a properties file
			properties.load(input);
			// properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(configFile));


		}
		Logger logger = instantiate("com.foo.bar.MyInterfaceImpl", Logger.class);
			    
	
		
		if(properties.containsKey("com.vaani.logger.impl.SimpleLogger"))
			putSimpleLogger(clazz);
		
		//putLogger(clazz, LogLevel.INFO);
		return loggers.get(clazz);
	}
	
	public static <T> T instantiate(final String className, final Class<T> type){
	    try{
	        return type.cast(Class.forName(className).newInstance());
	    } catch(final InstantiationException e){
	        throw new IllegalStateException(e);
	    } catch(final IllegalAccessException e){
	        throw new IllegalStateException(e);
	    } catch(final ClassNotFoundException e){
	        throw new IllegalStateException(e);
	    }
	}

	/**
	 * Puts a logger into the cache, if it already exists - return existing
	 * logger.
	 *
	 * @param clazz
	 *            The class to associate the
	 *            {@link com.ttaylorr.dev.logger.Logger}
	 * @param minimum
	 *            The minimum {@link com.ttaylorr.dev.logger.LogLevel} to log
	 *            at. If there is already a logger, its log level is not
	 *            modified.
	 * @return
	 */
	private static Logger putSimpleLogger(Class clazz) {
		if (loggers.containsKey(clazz)) {
			return loggers.get(clazz);
		}
		LogLevel l = LogLevel.DEBUG;
		if(properties.containsKey("loa.minimumLevel"))
			l = LogLevel.valueOf(properties.getProperty("loa.minimumLevel"));
		Logger logger = new SimpleLogger(System.out, l);
		loggers.put(clazz, logger);
		return logger;
	}
	
	
	public static Logger putLogger(Class clazz) {
		return putLogger(clazz, LogLevel.DEBUG);
	}

}
