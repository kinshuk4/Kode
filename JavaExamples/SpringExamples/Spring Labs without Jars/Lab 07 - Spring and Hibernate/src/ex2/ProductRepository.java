package ex2;

import java.util.List;

public interface ProductRepository {

	public void add(AnnotatedProduct product);
	public AnnotatedProduct get(int productId);
	public List<AnnotatedProduct> getAll();
	
}
