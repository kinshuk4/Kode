package com.vaani.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TimerBarrierDemo {

	public static void main(String[] args) throws Exception {
		int threads = 3;
		final CyclicBarrier barrier = new CyclicBarrier(threads, new BarrierTimer());

		ExecutorService svc = Executors.newFixedThreadPool(threads);
		for (int i = 0; i < threads; i++) {
			svc.execute(new Runnable() {
				public void run() {
					try {
						barrier.await();
						long sleepTime = (int) (Math.random() * 1000);
						System.out.println(Thread.currentThread().getId()
								+ " working for " + sleepTime);
								Thread.sleep(sleepTime);
								barrier.await();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	private static class BarrierTimer implements Runnable {
		private long start;

		public void run() {
			if (start == 0) {
				start = System.currentTimeMillis();
			} else {
				long end = System.currentTimeMillis();
				long elapsed = (end - start);
				System.out.println("Completed in " + elapsed + " ms");
			}
		}
	}
}