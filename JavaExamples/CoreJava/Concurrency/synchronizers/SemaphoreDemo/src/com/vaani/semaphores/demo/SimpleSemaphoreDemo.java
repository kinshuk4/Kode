package com.vaani.semaphores.demo;

import java.util.*;
 import java.util.concurrent.*;
class SimpleSemaphoreDemo 
 {
 	public static void main(String[] args) 
 	{
 		// Limiting No on threads running to 2
 		Semaphore semaphore = new Semaphore(3);
 		for(int i=0 ;i<5;i++){
 			new MyThread(String.valueOf(i),semaphore).start();
 		}
 		System.out.println("End of Semaphore Test");
 	}
}
 
 
 class MyThread extends Thread
 {

	private String name  = null;	
 	private Semaphore semaphore =null;
	public MyThread(String name,Semaphore semaphore){

 		this.name = name;
 		this.semaphore = semaphore;
 	}
 

 	public void run(){
 		try{
 		semaphore.acquire();
 		System.out.println("Thread "+ name +" is start running");
 		sleep(500);
 		semaphore.release();
 		System.out.println("Thread "+ name +" Ends");
 		}catch(Exception exp){
 			exp.printStackTrace();
 		}
 	}
 
 }
