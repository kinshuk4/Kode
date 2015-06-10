package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class JdbcProductRepository  implements ProductRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional()
	public void reduceStock(int productId, int quantity) {
		String sql = "update tx_productsasjfhsd set quantity = quantity - ? where productid = ?";
		jdbcTemplate.update(sql, quantity, productId);
	}
}
