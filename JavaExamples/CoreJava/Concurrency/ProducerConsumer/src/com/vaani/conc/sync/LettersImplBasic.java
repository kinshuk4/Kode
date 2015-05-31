package com.vaani.conc.sync;

import com.vaani.conc.common.Letters;

public class LettersImplBasic implements Letters{
	private static final int BUFFER_CAPACITY = 6;
	private static char[] buffer = new char[BUFFER_CAPACITY];
	private int next = 0;
	private boolean isFull = false;
	private boolean isEmpty = true;

	@Override
	public synchronized void addLetter(char ch) {
		while(isFull){
			try{
				wait();
			}catch(InterruptedException ex){}
		}
		buffer[next++] = ch;
		
		//Are we full?
		if(next == BUFFER_CAPACITY-1){
			isFull =  true;
		}
		
		isEmpty = false;
		notifyAll();
	}

	@Override
	public synchronized char takeLetter() {
		while(isEmpty){
			try{
				wait();
			}catch(InterruptedException ex){}
		}
		char ch = buffer[next--] ;
		
		
		//Are we empty?
		if(next == 0){
			isEmpty =  true;
		}
		
		isFull = false;
		notifyAll();
		return ch;
	}
	
	

}
