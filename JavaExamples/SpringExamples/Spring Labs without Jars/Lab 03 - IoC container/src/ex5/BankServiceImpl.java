package ex5;

import org.springframework.beans.factory.annotation.Required;

public class BankServiceImpl implements BankService {

	private CustomerService customerService;
	private BillPaymentService billPaymentService;
	
	@Required
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@Required
	public void setBillPaymentService(BillPaymentService billPaymentService) {
		this.billPaymentService = billPaymentService;
	}	

	public BillPaymentService getBillPaymentService() {
		return billPaymentService;
	}
	
	public CustomerService getCustomerService() {
		return customerService;
	}
}
