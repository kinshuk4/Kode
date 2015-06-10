package ex1;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

//Using HibernateDaoSupport class to make it much more simpler
public class HibernateProductRepository3 extends HibernateDaoSupport implements ProductRepository {

	@Override
	public void add(Product product) {
		getHibernateTemplate().save(product);		
	}

	@Override
	public Product get(int productId) {
		Product product = (Product) getHibernateTemplate().get(Product.class, productId);
		return product;
	}

	@Override
	public List<Product> getAll() {
		List<Product> products = getHibernateTemplate().find("from Product");
		return products;
	}

}
