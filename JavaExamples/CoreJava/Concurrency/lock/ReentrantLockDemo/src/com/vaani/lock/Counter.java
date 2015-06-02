package com.vaani.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

 public class Counter {
    private int count;
    private Lock lock = new ReentrantLock();

    public int getNextValue() {
	try {
	    lock.lock();
	    count++;
	}
	finally {
	    lock.unlock();
	    return count;
	}
	
    }


}