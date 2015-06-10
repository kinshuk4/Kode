package ex2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

//Spring's direct support for JSR standard annotations for JPA
//is the best approach for accessing the EntityManager
//Similar to HibernateSupport classes, we also have JpaTemplate
//and JpaDaoSupport class as well, but not used widely though
public class JpaProductRepository implements ProductRepository {

	@PersistenceContext(unitName="SpringJPA")
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void add(AnnotatedProduct product) {
		entityManager.persist(product);
	}

	@Override
	public AnnotatedProduct get(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AnnotatedProduct> getAll() {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
