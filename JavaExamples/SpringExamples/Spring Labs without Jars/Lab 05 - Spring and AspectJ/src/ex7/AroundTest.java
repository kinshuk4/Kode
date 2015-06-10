package ex7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ex7/ex7-config.xml")
public class AroundTest {

	@Autowired private CustomerService customerService;

	@Test
	public void testAroundAdvice() {
		customerService.applyForChequeBook(12345);
		customerService.stopCheque(12345);
	}
	
}
