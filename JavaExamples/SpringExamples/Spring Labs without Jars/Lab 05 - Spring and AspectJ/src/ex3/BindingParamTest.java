package ex3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.Order;
import service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ex3/ex3-config.xml")
public class BindingParamTest {

	@Autowired private OrderService orderService;
	
	@Test
	public void testOrder() {
		orderService.placeOrder(new Order());
	}
}
