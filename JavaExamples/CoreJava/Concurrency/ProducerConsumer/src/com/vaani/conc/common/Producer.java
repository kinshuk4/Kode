package com.vaani.conc.common;


public class Producer extends Thread{
	private Letters pool;
	private final static String ALPHABET = "ABCDEFGHIGJKLMNOPQRSUVWXYZ";
	
	public Producer(Letters thePool, String threadName){
		super(threadName);
		this.pool = thePool;
	}
	
	public void run(){
		char ch;
		//Add 10 letters to the pool
		for(int i = 0 ; i < 10; i++){
			ch  = ALPHABET.charAt((int)(Math.random()*26));
			pool.addLetter(ch);
			System.out.println("Thread:" + getName() + " added " + ch);
			//random wait till we add next character to the pool
			try{
				sleep((int) Math.random() * 100);
			}catch(InterruptedException ex){}
		}
	}
}
