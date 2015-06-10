package repository;

import java.util.List;
import java.util.Map;

import entity.Flight;

public interface FlightRepository {

	public int getTotalFlights();
	
	public int getTotalFlights(String carrier);
	
	public Map getFlightInfo(String flightNo);
	
	public List getFlights(String carrier);
	
	public int getTotalFlights(String from, String to);
	
	public List<Flight> getAvailableFlights(String carrier);
	
	public void newFlight(Flight flight);

}
