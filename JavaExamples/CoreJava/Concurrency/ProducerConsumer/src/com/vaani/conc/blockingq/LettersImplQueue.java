package com.vaani.conc.blockingq;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.vaani.conc.common.Letters;

public class LettersImplQueue implements Letters{
	private static final int BUFFER_CAPACITY = 6;
	private BlockingQueue<Character> pool = new ArrayBlockingQueue<Character>(BUFFER_CAPACITY);

	@Override
	public void addLetter(char ch) {
		try{
			pool.put(ch);//Blocks if queue is full, i.e. no space
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		
	}

	@Override
	public char takeLetter() {
		Character ch = null;
		try{
			ch = pool.take();
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		return ch;
	}

}
