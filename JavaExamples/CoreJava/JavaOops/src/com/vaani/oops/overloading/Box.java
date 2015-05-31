package com.vaani.oops.overloading;

public class Box {
	void findArea(int length) {
		System.out.println("Area (1 arg) = " + (length * length));
	}

	void findArea(double length) {
		System.out.println("Double Area = " + (length * length));
	}

	void findArea(int length, int width) {
		System.out.println("Area (2 args) = " + (length * width));
	}

	int add(int a, int b) {
		return b;
	}

	float add(float a, int b) {
		return b;
	}

	float add(int a, float b) {
		return b;
	}

	void add(float a) {
	}

	int add(int a) {
		return a;
	}

	void add(int a) {
	}// error conflict with the method int add(int a)
}
