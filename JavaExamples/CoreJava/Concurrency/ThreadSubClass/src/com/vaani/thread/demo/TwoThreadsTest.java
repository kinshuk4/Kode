package com.vaani.thread.demo;

import com.vaani.thread.SimpleThread;

public class TwoThreadsTest {
    public static void main (String[] args) {
        new SimpleThread("Jamaica").start();
        new SimpleThread("Fiji").start();
    }
}
