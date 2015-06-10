package ex2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ex2/ex2-config.xml")
public class BeforeAspectTest {

	@Autowired
	private CustomerService customerService;

	@Test
	public void testAspect() {
		customerService.applyForChequeBook(12345);
		customerService.applyForCreditCard("Majrul Ansari", 9999.9);
		customerService.stopCheque(12345);
		customerService.balance(12345);
	}
}
