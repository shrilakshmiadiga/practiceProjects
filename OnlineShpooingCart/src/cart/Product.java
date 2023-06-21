package cart;

public class Product {

	public Product() {
	}
	
	public Product(Integer productId, String name, Double price) {
		this.price=price;
		this.name=name;
		this.productId=productId;
	}
	
	Integer productId;
	String name;
	Double price;

}
