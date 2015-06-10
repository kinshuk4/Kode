package ex1;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

//Using HibernateTemplate to guarantee accurate Session management
public class HibernateProductRepository2 implements ProductRepository {

	private HibernateTemplate hibernateTemplate;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Override
	public void add(Product product) {
		hibernateTemplate.save(product);		
	}

	@Override
	public Product get(int productId) {
		Product product = (Product) hibernateTemplate.get(Product.class, productId);
		return product;
	}

	@Override
	public List<Product> getAll() {
		List<Product> products = hibernateTemplate.find("from Product");
		return products;
	}

}
