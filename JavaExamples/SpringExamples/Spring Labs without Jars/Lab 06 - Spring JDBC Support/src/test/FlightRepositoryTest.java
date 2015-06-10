package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import repository.FlightRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ex-config.xml")
public class FlightRepositoryTest {

	@Autowired private FlightRepository flightRepository;
	
	@Test
	public void testDifferentMethods() {
		System.out.println(flightRepository.getTotalFlights());
		//System.out.println(flightRepository.getTotalFlights("KINGFISHER"));
		//System.out.println(flightRepository.getFlightInfo("JL-120"));
		//System.out.println(flightRepository.getFlights("KINGFISHER"));
		//System.out.println(flightRepository.getTotalFlights("MUMBAI", "JAIPUR"));
		//System.out.println(flightRepository.getAvailableFlights("KINGFISHER"));
	}	
}
