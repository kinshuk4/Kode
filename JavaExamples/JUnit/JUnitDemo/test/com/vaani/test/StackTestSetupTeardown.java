package com.vaani.test;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackTestSetupTeardown {

	Stack stack;
	 @Before
	 public void noSetup() {
	   stack = new Stack<Integer>();
	   stack.push(4);
	 }

	 @After
	 public void noTearDown() {
	   stack = null;
	 }
	 
	 @Test
	 public void pushTest()
	 {
		 assertEquals(4,stack.peek());
	 }

}
