package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import entity.Order;

import service.OnlineShoppingService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ex-config.xml")
public class TransactionTest {

	@Autowired private OnlineShoppingService onlineShopping;
	
	@Test
	public void testTx() {
		Order order = new Order();
		order.setProductId(123);
		order.setPrice(999.9);
		order.setQuantity(2);
		onlineShopping.placeOrder(order);
	}
}
