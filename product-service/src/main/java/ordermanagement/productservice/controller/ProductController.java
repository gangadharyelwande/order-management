package ordermanagement.productservice.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ordermanagement.productservice.model.Product;
import ordermanagement.productservice.repository.ProductRepository;

@RestController
public class ProductController {
	
	private Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	  @Autowired
	  private ProductRepository productRepository;
	 
	  @GetMapping("/product-service/getAllProducts")
	  public List<Product> getAllProducts() {
	    return productRepository.findAll();
	  }
	  
	  @GetMapping("/findByName/{productName}")
	  public Product findProductByName(@PathVariable("productName") String productName) {
		  Product productDetails= productRepository.findByName(productName);
		  
		  logger.info("Product Details are {}", productDetails);
		  
		  return productDetails;
	  }
	  
	  @GetMapping("/findById/{id}")
	  public Optional<Product> findById(@PathVariable("id") Long id) {
		return productRepository.findById(id);
	  }
		
	 /* @PostMapping("/findAllIds/{ids}")
	  public Optional<List<Product>> findAllIds(@RequestBody List<Long> ids) {
		return productRepository.findAll(ids);
	  }*/
		
	  @DeleteMapping("/deleteProduct/{id}")
	  public void delete(@PathVariable("id") BigInteger id) {
		  productRepository.deleteById(id);
	  }
	  
	  
	  @PostMapping
	  public void add(@RequestBody Product product) {
		 productRepository.save(product);
	  }
		
	  @PutMapping
	  public void update(@RequestBody Product product) {
			productRepository.save(product);
			//productRepository.findB("T J Max Toys");
	  }
}


