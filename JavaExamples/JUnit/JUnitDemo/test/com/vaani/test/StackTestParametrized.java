package com.vaani.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class StackTestParametrized {
 Stack<Integer> stack;
 private int number;

 public StackTestParametrized(int number) {
	 stack=new Stack<Integer>();
   this.number = number;
 }

 @Parameters
 public static Collection data() {
   Object[][] data = new Object[][] { { 1 }, { 2 }, { 3 }, { 4 } };
   return Arrays.asList(data);
 }
 
}
