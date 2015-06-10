package service;

import java.io.Serializable;

import ex2.Log;

public class CustomerServiceImpl implements CustomerService, Serializable {

	public void applyForChequeBook(long acno) {
		System.out.println("applyForChequeBook method called..");
	}
	
	public void stopCheque(long acno) {
		System.out.println("stopCheque method called..");
	}
	
	public void applyForCreditCard(String name, double salary) {
		System.out.println("applyForCreditCard method called..");
	}
	
	@Log
	public double balance(long acno) {
		System.out.println("balance method called..");
		return 9999.9;
	}
}
