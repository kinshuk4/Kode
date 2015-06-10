package ex3;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyServiceLocatorTest {

	@Test
	public void testMyServiceLocator() {
		ApplicationContext container = new ClassPathXmlApplicationContext("ex3/ex3-config.xml");
		MyService myService = container.getBean("myService", MyService.class);
		Assert.assertNotNull(myService);
	}
}
