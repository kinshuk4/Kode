package ex6;

public class CustomerServiceImpl3 implements CustomerService {

	private BillPaymentServiceFactory billPaymentServiceFactory;
	
	public void setBillPaymentServiceFactory(
			BillPaymentServiceFactory billPaymentServiceFactory) {
		this.billPaymentServiceFactory = billPaymentServiceFactory;
	}

	public void payBill(double amt) {
		BillPaymentService billService = billPaymentServiceFactory.getService();
		//we need to call some method of BillPaymentService here. Right now not required.		
	}
}

