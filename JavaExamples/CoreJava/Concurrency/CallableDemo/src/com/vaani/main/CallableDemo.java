package com.vaani.main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import com.vaani.callable.CallableImpl;


public class CallableDemo {

	public static void main(String[] args) {
		Callable<Integer> callable = new CallableImpl(2);

		ExecutorService executor = new ScheduledThreadPoolExecutor(5);
		Future<Integer> future = executor.submit(callable);

		try {
			System.out.println("Future value: " + future.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
