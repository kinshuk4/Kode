package com.vaani.lock.demo;
import com.vaani.lock.*;
public class ReentrantLockDemo {
    public static void main(String[] args) throws Exception {
	Counter counter = new Counter();
	Thread t1 = new Thread(new Worker(counter, true, 10000));
	t1.start();
	Thread t2 = new Thread(new Worker(counter, false, 10000));
	t2.start();

	t1.join();
	t2.join();
	System.out.println("Final count: " + counter.getNextValue());
    }
}
