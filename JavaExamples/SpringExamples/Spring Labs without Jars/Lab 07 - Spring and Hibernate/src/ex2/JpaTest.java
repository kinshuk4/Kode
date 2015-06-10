package ex2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ex2/ex2-config.xml")
public class JpaTest {

	@Autowired private ProductRepository productRepository;
	
	@Test
	public void testHibernate() {
		AnnotatedProduct p = new AnnotatedProduct();
		p.setName("Majrul's Hackbook");
		p.setDescription("Hackintosh is fun!");
		p.setPrice(20000.0);
		p.setQuantity(99);
		productRepository.add(p);
	}
}
