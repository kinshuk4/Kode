package com.vaani.threads;



import java.util.concurrent.Callable;

public class Calculator implements Callable<Integer> {

	public static final int OPERATION_ADD = 1;

	private int param1 = 0;
	private int param2 = 0;
	private int operation = 0;

	public Calculator(int param1, int param2, int operation) {
		this.param1 = param1;
		this.param2 = param2;
		this.operation = operation;
	}

	public int getParam1() {
		return param1;
	}

	public void setParam1(int param1) {
		this.param1 = param1;
	}

	public int getParam2() {
		return param2;
	}

	public void setParam2(int param2) {
		this.param2 = param2;
	}

	public int getOperation() {
		return operation;
	}

	public void setOperation(int operation) {
		this.operation = operation;
	}

	@Override
	public Integer call() throws Exception {
		int retValue = 0;
		switch (this.operation) {
		case 1:
			retValue = this.param1 + this.param2;
			break;
		// Additional cases can be similarly added for
		//other mathematical operations

		default:
			retValue = 0;
			break;
		}
		return Integer.valueOf(retValue) ;
	}
}
