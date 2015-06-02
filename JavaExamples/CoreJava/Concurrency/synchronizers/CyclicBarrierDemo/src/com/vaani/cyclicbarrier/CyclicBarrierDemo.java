package com.vaani.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {

	public static void main(String[] args) throws Exception {
		int nThreads = 3;
		final CyclicBarrier barrier = new CyclicBarrier(nThreads);

		ExecutorService esvc = Executors.newFixedThreadPool(nThreads);
		for (int i = 0; i < nThreads; i++) {
			esvc.execute(new Runnable() {
				public void run() {
					try {
						log("At run()");
						barrier.await();

						log("Do work");
						Thread.sleep((int) (Math.random() * 1000));

						log("Wait for end");
								barrier.await();

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