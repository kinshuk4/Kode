package com.vaani.oops.static1;

/**
 * Valid for JDK 7 or below
 * For JDK7 or above - Output:Error: Main method not found in class ExecuteWithoutMain, please define the main method as:
public static void main(String[] args)
 * @author kchandra
 *
 */
public class ExecuteWithoutMain {
	  static{  
		  System.out.println("static block is invoked");  
		  System.exit(0);  
		  }  
}
