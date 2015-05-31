package com.vaani.concurrency.counter;

public class SyncCounter {
    private long counter;

    public synchronized void reset() {
        counter = 0;
    }

    public synchronized void increment() {
        counter++;
    }

    public synchronized long getCounter() {
        return counter;
    }

}
