package com.vaani.thread.demo;

import com.vaani.thread.SimpleThread;

public class ThreeThreadsTest {
    public static void main (String[] args) {
        new SimpleThread("Jamaica").start();
        new SimpleThread("Fiji").start();
        new SimpleThread("Bora Bora").start();
    }
}
