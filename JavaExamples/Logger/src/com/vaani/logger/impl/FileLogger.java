package com.vaani.logger.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaani.logger.LogLevel;
import com.vaani.logger.Logger;

public class FileLogger implements Logger {
	
	private PrintWriter writer ; 
	private int maxFileSize;
    private final LogLevel minimum;
    private final SimpleDateFormat dateFormat;
	public FileLogger(LogLevel minimum, String fileName, int maxFileSize) throws FileNotFoundException, UnsupportedEncodingException{
		
		this.minimum = minimum;
		this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.writer = new PrintWriter(fileName, "UTF-8");
		this.maxFileSize = maxFileSize;
		
	}
	public void debug(String str, Object... args) {
		// TODO Auto-generated method stub
		
	}
	public void info(String str, Object... args) {
		// TODO Auto-generated method stub
		
	}
	public void warn(String str, Object... args) {
		// TODO Auto-generated method stub
		
	}
	public void severe(String str, Object... args) {
		// TODO Auto-generated method stub
		
	}
	public void debug(String str) {
		// TODO Auto-generated method stub
		
	}
	public void info(String str) {
		// TODO Auto-generated method stub
		
	}
	public void warn(String str) {
		// TODO Auto-generated method stub
		
	}
	public void severe(String str) {
		// TODO Auto-generated method stub
		
	}
    public void log(LogLevel level, String str, Object... args) {
        if (this.canLog(level)) {
            StringBuilder builder = new StringBuilder();

            builder.append(formatDate()).append(' ');
            builder.append('[').append(level.name()).append(']').append(' ');

            if (args != null) {
                for (Object o : args) {
                    str = str.replaceFirst("\\{\\}", o.toString());
                }
            }

            builder.append(str);
            writer.println(builder.toString());
        }
    }

    
    public boolean canLog(LogLevel level) {
        return level.compareTo(this.minimum) >= 0;
    }
	
    public String formatDate() {
        return this.dateFormat.format(new Date());
    }
	

}
