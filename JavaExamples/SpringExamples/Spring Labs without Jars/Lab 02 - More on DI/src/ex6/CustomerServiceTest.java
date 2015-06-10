package ex6;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerServiceTest {

	@Test
	public void testCustomerService() {
		ApplicationContext container = new ClassPathXmlApplicationContext("ex6/ex6-config.xml");	
		//You will find 3 entries of CustomerService in the xml file, so test all 3 implementations one by one
		CustomerService customerService = (CustomerService) container.getBean("customerService", CustomerService.class);
		Assert.assertNotNull(customerService);	
		//calling the method of to verify the dependency was injected correctly or not
		customerService.payBill(1000.0);
	}
}
