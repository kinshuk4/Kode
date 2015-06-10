package ex4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.CustomerService;
import service.Order;
import service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ex4/ex4-config.xml")
public class NamedPointcutTest {

	@Autowired private OrderService orderService;
	@Autowired private CustomerService customerService;
	
	@Test
	public void testNamedPointcuts() {
		orderService.placeOrder(new Order());
		customerService.applyForChequeBook(12345);
	}
}
