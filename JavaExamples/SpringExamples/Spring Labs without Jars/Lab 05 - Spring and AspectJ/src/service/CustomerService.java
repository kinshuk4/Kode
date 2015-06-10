package service;

public interface CustomerService {

	public void applyForChequeBook(long acno);

	public void stopCheque(long acno);

	public void applyForCreditCard(String name, double salary);

	public double balance(long acno);

}