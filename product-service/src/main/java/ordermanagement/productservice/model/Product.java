/**
 * 
 */
package ordermanagement.productservice.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author gyelwand
 *
 */
@Document(collection="Product")
public class Product {
	
	@Id
	private BigInteger id;
	private String name;
	private int price;
	
	public Product(String name, int price)  {
        this.name = name;
        this.price = price;
    }
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
