package repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Order;

@Repository
public class HibernateOrderRepository extends AbstractHibernateRepository implements OrderRepository {

	@Transactional
	public void processOrder(Order order) {
		//some processing logic
		getSessionFactory().getCurrentSession().save(order);
	}
}
