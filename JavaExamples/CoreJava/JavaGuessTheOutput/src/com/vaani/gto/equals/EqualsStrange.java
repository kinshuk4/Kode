package com.vaani.gto.equals;

public class EqualsStrange {

	public static void checkIntDouLong(){
		Integer i = new Integer (42);
		Long l = new Long (42);
		Double d = new Double (42.0);
		
		//Will not compile
//		System.out.println(i==l);
//		System.out.println(i==d);
//		System.out.println(l==d);
		
		System.out.println(i.equals(d));//false
		System.out.println(d.equals(i));//false
		System.out.println(l.equals(d));//false
		System.out.println(i.equals(42));//true
		System.out.println(l.equals(42));//false
	}
	
	public static void main(String[] args){
		checkIntDouLong();
	}
}
