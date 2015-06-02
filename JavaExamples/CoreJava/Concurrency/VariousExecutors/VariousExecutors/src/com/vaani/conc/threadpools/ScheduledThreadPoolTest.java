package com.vaani.conc.threadpools;


import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import com.vaani.threads.Calculator;
import com.vaani.threads.MyThread;


public class ScheduledThreadPoolTest {

	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
		ScheduledExecutorService svc = Executors.newScheduledThreadPool(2);
		System.out.println(df.format(new java.util.Date()) + " Time Runnable");
		svc.schedule(new MyThread(), 2, TimeUnit.SECONDS);
		System.out.println(df.format(new java.util.Date()) + " Time Callable");
		ScheduledFuture<Integer> sf = svc.schedule(new Calculator(1, 3,
			Calculator.OPERATION_ADD), 5, TimeUnit.SECONDS);
		try {
			System.out.println("Waiting for value.");
			Integer val = sf.get();
			System.out.println(df.format(new java.util.Date()) + " Time Callable Retrieve");
			System.out.println("Computed Value: " + val);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		svc.shutdown();

	}
}
