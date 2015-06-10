package ex7;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.FlightRepository;

public class FlightRepositoryTest {

	@Test
	public void testFlightRepository() throws Exception {
		ApplicationContext container = new ClassPathXmlApplicationContext("ex7/ex7-config-2.xml");
		FlightRepository flightRepo = container.getBean("flightRepository", FlightRepository.class); 
		Assert.assertNotNull(flightRepo);
		Assert.assertNotNull(flightRepo.getAvailableFlights());
		Assert.assertTrue(flightRepo.getAvailableFlights().size() > 0);
	}
}
