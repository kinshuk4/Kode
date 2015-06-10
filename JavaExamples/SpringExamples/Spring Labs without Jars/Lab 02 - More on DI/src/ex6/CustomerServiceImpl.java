package ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CustomerServiceImpl implements CustomerService, ApplicationContextAware {

	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) {
		this.ctx = ctx;
	}

	private BillPaymentService createBillPaymentInstance() {
		return ctx.getBean("billPaymentService", BillPaymentService.class);
	}
	
	public void payBill(double amt) {
		BillPaymentService billingService = createBillPaymentInstance();
		//we need to call some method of BillPaymentService here. Right now not required.
	}
}
