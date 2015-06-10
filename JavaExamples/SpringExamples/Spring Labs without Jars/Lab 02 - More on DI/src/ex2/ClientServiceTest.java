package ex2;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientServiceTest {

	@Test
	public void testClientService() {
		ApplicationContext container = new ClassPathXmlApplicationContext("ex2/ex2-config.xml");
		ClientService clientService = container.getBean("clientService", ClientService.class);
		Assert.assertNotNull(clientService);
	}
}
