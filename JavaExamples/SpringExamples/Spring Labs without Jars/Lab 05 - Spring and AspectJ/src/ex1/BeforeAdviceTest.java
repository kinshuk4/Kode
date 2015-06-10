package ex1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ex1/ex1-config.xml")
public class BeforeAdviceTest {

	@Autowired
	private CustomerService customerService;

	@Test
	public void testAspect() {
		//getClass will confirm that a proxy was created dynamically
		System.out.println(customerService.getClass());
		//calling the method of the bean class. Client has no idea that
		customerService.applyForChequeBook(12345);
	}
}
