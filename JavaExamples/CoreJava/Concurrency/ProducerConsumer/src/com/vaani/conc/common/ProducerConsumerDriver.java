package com.vaani.conc.common;

import com.vaani.conc.blockingq.LettersImplQueue;
import com.vaani.conc.sync.LettersImplBasic;

public class ProducerConsumerDriver {
	public static Letters letterPool = new LettersImplQueue();
	
	public static void main(String[] args){
		new Producer(letterPool,"Producer1").start();
		new Producer(letterPool,"Producer2").start();
		new Consumer(letterPool,"Consumer1").start();
		new Consumer(letterPool,"Consumer2").start();
		
	}

}
