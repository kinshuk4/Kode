package ex6;

import org.springframework.beans.factory.ObjectFactory;

public class CustomerServiceImpl2 implements CustomerService {

	private ObjectFactory<BillPaymentService> factory;
	
	public void setFactory(ObjectFactory<BillPaymentService> factory) {
		this.factory = factory;
	}
	
	public void payBill(double amt) {
		BillPaymentService billService = factory.getObject();
		//we need to call some method of BillPaymentService here. Right now not required.		
	}
}
