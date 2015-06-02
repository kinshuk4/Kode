package com.vaani.threads;

import java.text.SimpleDateFormat;

import com.vaani.conc.*;
import com.vaani.conc.utils.ConcurrencyUtils;

public class MyThread implements Runnable {

	private int delayTime = 0;

	public MyThread(int delayTime) {
		this.delayTime = delayTime;
	}

	public MyThread() {

	}

	@Override
	public void run() {
		Thread curThread = Thread.currentThread();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
		System.out.println(df.format(new java.util.Date()) + " Starting thread " + curThread.getName());
		try {
			Thread.sleep(delayTime * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(this.toString());
		System.out.println(df.format(new java.util.Date()) + " Ending thread " + curThread.getName());
		
	}

	@Override
	public String toString() {
		return ConcurrencyUtils.getThreadInfo();
	}

}
