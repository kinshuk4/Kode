package ex1;

import java.util.List;

import ex1.Product;

public interface ProductRepository {

	public void add(Product product);
	public Product get(int productId);
	public List<Product> getAll();
	
}
