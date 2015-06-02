package com.vaani.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vaani.testee.Calc;

public class CalcTest {
	 @Test
	 public void testAdd() {
	  assertEquals(5, new Calc().add(2, 3));
	 }
	}
