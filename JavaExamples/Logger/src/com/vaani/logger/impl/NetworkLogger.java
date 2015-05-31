package com.vaani.logger.impl;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaani.logger.*;

public class NetworkLogger implements Logger {
    private final LogLevel minimum;
    private final SimpleDateFormat dateFormat;

	public NetworkLogger(LogLevel minimum,InetAddress address,int port){
        this.minimum = minimum;
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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
		// TODO Auto-generated method stub
		
	}

	public boolean canLog(LogLevel level) {
		// TODO Auto-generated method stub
		return false;
	}
	
    public String formatDate() {
        return this.dateFormat.format(new Date());
    }

}
