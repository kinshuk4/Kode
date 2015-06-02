package com.vaani.mutex;

import java.util.concurrent.Semaphore;

public class Counter {
    private int value = 0;
    
    private final Semaphore mutex = new Semaphore(1);
 
    public int getNextValue() throws InterruptedException {
        try {
            mutex.acquire();
            return value++;
        } finally {
            mutex.release();
        }
    }
}


