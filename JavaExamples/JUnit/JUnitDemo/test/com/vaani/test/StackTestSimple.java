package com.vaani.test;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class StackTestSimple {
	
	Stack stack;
	@Test
	public void emptyTest() {
	 stack = new Stack<String>();
	 assertTrue(stack.isEmpty());
	}


}
