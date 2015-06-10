package ex3;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

	@Test
	public void testLifecycle() {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ex3/ex3-config.xml");
		//since singleton beans are instantiated on startup, we even don't need to call
		//getbean for testing the lifecycle of individual beans.
		ctx.close();
	}
}
