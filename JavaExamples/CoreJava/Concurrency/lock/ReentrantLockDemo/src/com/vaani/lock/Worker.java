package com.vaani.lock;

public class Worker implements Runnable {
	private Counter counter;
	private boolean increment;
	private int count;

	public Worker(Counter counter, boolean increment, int count) {
		this.counter = counter;
		this.increment = increment;
		this.count = count;
	}

	public void run() {
		for (int i = 0; i < this.count; i++) {
			System.out.println(this.counter.getNextValue());


		}
	}
}
