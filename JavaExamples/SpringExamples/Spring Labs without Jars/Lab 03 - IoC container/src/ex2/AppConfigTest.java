package ex2;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfigTest {

	@Test
	public void testAppConfig() {
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		 BankService bankService = ctx.getBean(BankService.class);
		 Assert.assertNotNull(bankService);
		 Assert.assertNotNull(bankService.getBillPaymentService());
		 Assert.assertNotNull(bankService.getCustomerService());
	}
}
