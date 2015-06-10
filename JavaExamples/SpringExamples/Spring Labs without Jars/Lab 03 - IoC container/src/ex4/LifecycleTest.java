package ex4;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

	@Test
	public void testLifecycle() {
		System.out.println("Before loading the IoC container..");
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ex4/ex4-config.xml");
		//As you run this you will get to know what happens behind the scenes inside the IoC container
		System.out.println("Before starting the IoC container..");
		ctx.start();
		System.out.println("Before refreshing the IoC container..");
		ctx.refresh();
		System.out.println("Before stopping the IoC container..");
		ctx.stop();		
		System.out.println("Before closing the IoC container..");
		ctx.close();
	}
}
