package repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Payment;

@Repository
public class HibernatePaymentRepository extends AbstractHibernateRepository implements PaymentRepository {

	@Transactional
	public void store(Payment paymentDetails) {
		//some payment processing
		getSessionFactory().getCurrentSession().save(paymentDetails);
	}
}
