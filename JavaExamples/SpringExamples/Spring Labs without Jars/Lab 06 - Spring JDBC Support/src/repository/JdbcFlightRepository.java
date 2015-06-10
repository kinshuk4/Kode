package repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import entity.Flight;

public class JdbcFlightRepository implements FlightRepository {

	private SimpleJdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedTemplate;
	
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new SimpleJdbcTemplate(dataSource);
		namedTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public int getTotalFlights() {
		return jdbcTemplate.queryForInt("select count(*) from flights_test");
	}
	
	public int getTotalFlights(String carrier) {
		return jdbcTemplate.queryForInt("select count(*) from flights_test where carrier = ?",
				new Object[]{carrier});
	}
	
	public Map getFlightInfo(String flightNo) {
		return jdbcTemplate.queryForMap("select * from flights_test where flightno=?",
				flightNo);				
	}
	
	public List getFlights(String carrier) {
		return jdbcTemplate.queryForList("select * from flights_test where carrier = ?", carrier);
	}
	
	public int getTotalFlights(String from, String to) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("from", from);
		params.put("to", to);
		String sql = "select count(*) from flights_test where kahase=:from and kahatak=:to";
		return namedTemplate.queryForInt(sql, params);
	}
	
	public List<Flight> getAvailableFlights(String carrier) {
		class FlightMapper implements RowMapper<Flight> {
			@Override
			public Flight mapRow(ResultSet rs, int index) throws SQLException {
				Flight flight = new Flight();
				flight.setFlightNo(rs.getString(1));
				flight.setCarrier(rs.getString(2));
				flight.setFrom(rs.getString(3));
				flight.setTo(rs.getString(4));
				return flight;
			}
		}
		return jdbcTemplate.query("select * from flights_test where carrier = ?", new FlightMapper(), carrier);
	}
	
	public void newFlight(Flight flight) {
		jdbcTemplate.update("insert into flights_test values(?, ?, ?, ?)", 
				flight.getFlightNo(), flight.getCarrier(), flight.getFrom(), flight.getTo());
	}
}
