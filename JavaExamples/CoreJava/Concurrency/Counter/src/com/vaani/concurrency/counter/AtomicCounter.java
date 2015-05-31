package com.vaani.concurrency.counter;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    private AtomicInteger counter = new AtomicInteger();

    public void reset() {
        counter.set(0);
    }

    public void increment() {
        counter.getAndIncrement();
    }
    
    // Alternative implementation as increment but just make the 
    // implementation explicit
    public int incrementLongVersion(){
      int oldValue = counter.get();
      while (!counter.compareAndSet(oldValue, oldValue+1)){
         oldValue = counter.get();
      }
      return oldValue+1;
    }

    public long getCounter() {
        return counter.get();
    }

}
