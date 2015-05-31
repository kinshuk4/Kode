package com.vaani.conc.common;


public class Consumer extends Thread{
	private Letters pool;
	
	public Consumer(Letters thePool, String threadName){
		super(threadName);
		this.pool = thePool;
	}
	
	public void run(){
		char ch;
		//Add 10 letters to the pool
		for(int i = 0 ; i < 10; i++){
			ch  = pool.takeLetter();
			
			System.out.println("Thread:" + getName() + " took letter " + ch);
			//random wait till we add next character to the pool
			try{
				sleep((int) Math.random() * 2000);
			}catch(InterruptedException ex){}
		}
	}
}
 