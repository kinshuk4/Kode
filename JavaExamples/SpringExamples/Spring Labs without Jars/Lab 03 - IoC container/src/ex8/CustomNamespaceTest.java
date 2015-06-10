package ex8;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomNamespaceTest {

	@Test
	public void testCustomNamespace() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ex8/ex8-config.xml");
		FlightServiceDao dao = (FlightServiceDao) ctx.getBean("flightDao");
		List flights = dao.getAvailableFlights();
		Assert.assertNotNull(flights);
	}
}
