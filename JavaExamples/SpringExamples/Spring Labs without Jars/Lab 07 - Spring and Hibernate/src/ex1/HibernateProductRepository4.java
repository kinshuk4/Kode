package ex1;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

//HibernateTemplate doesn't expose all the methods of the Hibernate Session interface
//So sometimes we end up writing more code when using HibernateTemplate
//HibernateDaoSupport provides direct access to underlying Session but this time
//no need to worry about session management issues
public class HibernateProductRepository4 extends HibernateDaoSupport implements ProductRepository {

	@Override
	public void add(Product product) {
		Session session = getSession(false);
		session.save(product);
	}

	@Override
	public Product get(int productId) {
		Session session = getSession(false);
		Product product = (Product) session.get(Product.class, productId);
		return product;
	}

	@Override
	public List<Product> getAll() {
		Session session = getSession(false);
		List<Product> products = session.createQuery("from Product").list();
		return products;
	}

}
