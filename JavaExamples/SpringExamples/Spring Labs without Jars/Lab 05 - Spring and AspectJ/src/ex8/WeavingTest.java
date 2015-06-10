package ex8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.CustomerService;
import service.CustomerServiceImpl;
import service.Order;
import service.OrderService;
import service.OrderServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ex8/ex8-config.xml")
public class WeavingTest {

	@Autowired private CustomerService customerService;

	@Test
	public void testAroundAdvice() {
		//calling getClass to verify whether a proxy was create
		//or the same class was weaved
		System.out.println(customerService.getClass().getName());
		//customerService.applyForChequeBook(12345);
		//customerService.stopCheque(12345);
		//manually creating a new instance bypassing sping
		customerService = new CustomerServiceImpl();
		customerService.applyForChequeBook(12345);
		customerService.stopCheque(12345);

	}
	
}
