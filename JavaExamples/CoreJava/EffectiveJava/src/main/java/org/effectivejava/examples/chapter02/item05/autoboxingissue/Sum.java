package org.effectivejava.examples.chapter02.item05.autoboxingissue;

public class Sum {
	// Hideously slow program! Can you spot the object creation?
	public static void main(String[] args) {
		//sum is Long rather than long
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
