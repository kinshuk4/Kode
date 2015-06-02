package com.vaani.semaphores.demo;

import java.util.concurrent.Semaphore;

import com.vaani.mutex.Counter;

public class MutexDemo extends Thread{
	public static void main(String[] args) 
 	{
 		// Limiting No on threads running to 2
		Counter counter = new Counter();
 		for(int i=0 ;i<5;i++){
 			new MutexThread(String.valueOf(i),counter ).start();
 		}
 		System.out.println("End of Semaphore Test");
 	}
}
 
 
 class MutexThread extends Thread
 {

	private String name  = null;	
 	private Counter counter =null;
	public MutexThread(String name,Counter counter_){

 		this.name = name;
 		this.counter = counter_;
 	}
 

 	public void run(){
 		try {
			System.out.println("Counter is now "+counter.getNextValue());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 
 }

