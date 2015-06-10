package ex1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

//Using Spring just to inject the SessionFactory
//No need to use any Spring specific API
@Transactional
public class HibernateProductRepository implements ProductRepository {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void add(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.save(product);
	}

	@Override
	public Product get(int productId) {
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, productId);
		return product;
	}

	@Override
	public List<Product> getAll() {
		Session session = sessionFactory.getCurrentSession();
		List<Product> products = session.createQuery("from Product").list();
		return products;
	}

}
