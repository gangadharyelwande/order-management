package ordermanagement.productservice.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import ordermanagement.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, BigInteger> {
	
	public Optional<Product> findById(Long id);
	public Product findByName(String productName);
	
	//List<Product> findAll();
	
	//public Product findByName(String name);
	
	//public Optional<List<Product>> findAllIds(List<Long> ids);

	
	
	/*public void delete(Long id);
	
	public void add(Product product);
	
	public void update(Product product);
	*/
	
	
	/*public Product add(Product product) {
		
	}
	
	public Product update(Product product) {
		
	}
	
	public Product findById(Long id) {
		
	}
	
	public void delete(Long id) {
		
	}
	
	public List<Product> find(List<Long> ids) {
		
	}*/

}
