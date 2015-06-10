package ex4;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyServiceLocatorTest {

	@Test
	public void testMyServiceLocator() {
		ApplicationContext container = new ClassPathXmlApplicationContext("ex4/ex4-config.xml");
		MyService myService = container.getBean("myService", MyService.class);
		Assert.assertNotNull(myService);
	}
}
