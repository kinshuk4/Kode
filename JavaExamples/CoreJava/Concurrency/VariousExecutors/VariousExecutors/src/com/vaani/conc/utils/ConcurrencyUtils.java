package com.vaani.conc.utils;

import java.text.SimpleDateFormat;

public class ConcurrencyUtils {

	public static String getThreadInfo() {
		StringBuilder sb = new StringBuilder();
		Thread curThread = Thread.currentThread();
		sb.append("Thread Id: ");
		sb.append(curThread.getId());
		sb.append("\n");
		sb.append("Name: ");
		sb.append(curThread.getName());
		sb.append("\n");
		sb.append("Group: ");
		sb.append(curThread.getThreadGroup().getName());
		sb.append("\n");
		return sb.toString();
	}

	public static String getShortThreadInfo() {
		StringBuilder sb = new StringBuilder();
		Thread curThread = Thread.currentThread();
		sb.append("Thread Id: ");
		sb.append(curThread.getId());
		sb.append(", ");
		sb.append("Name: ");
		sb.append(curThread.getName());
		sb.append(", ");
		sb.append("Group: ");
		sb.append(curThread.getThreadGroup().getName());
		sb.append("\n");
		return sb.toString();
	}

	public static String retrieveCurrentDate(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
		return df.format(new java.util.Date());
	}

}
