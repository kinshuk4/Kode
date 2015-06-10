package ex8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class FlightServiceDao {

	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List getAvailableFlights() {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			String sql = "select * from flights_test";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			List rows = new ArrayList();
			while(rs.next()) {
				Flight f = new Flight();
				f.setFlightNo(rs.getString(1));
				f.setCarrier(rs.getString(2));
				f.setFrom(rs.getString(3));
				f.setTo(rs.getString(4));
				rows.add(f);
			}
			return rows;
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			try { rs.close(); pst.close(); conn.close(); } catch(Exception e) { }
		}
	}
}
