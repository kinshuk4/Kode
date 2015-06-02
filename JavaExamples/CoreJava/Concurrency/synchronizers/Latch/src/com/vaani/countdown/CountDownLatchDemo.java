package com.vaani.countdown;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {

	public static void main(String[] args) throws Exception {
		int nThreads = 3;
		final CountDownLatch startLatch = new CountDownLatch(nThreads);
		final CountDownLatch endLatch = new CountDownLatch(nThreads);

		ExecutorService svc = Executors.newFixedThreadPool(nThreads);
		for (int i = 0; i < nThreads; i++) {
			svc.execute(new Runnable() {
				public void run() {
					try {
						log("At run()");
						startLatch.countDown();
						startLatch.await();

						log("Do work");
						Thread.sleep((int) (Math.random() * 1000));

						log("Wait for end");
						endLatch.countDown();
						endLatch.await();

						log("Done");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			Thread.sleep(100);
		}
	}

	private static void log(String msg) {
		System.out.println(System.currentTimeMillis() + ": "
				+ Thread.currentThread().getId() + " " + msg);
	}
}