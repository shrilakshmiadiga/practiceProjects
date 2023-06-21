package cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ShoppingCart {

	public ShoppingCart() {

	}

	ArrayList<Product> productList = new ArrayList<>();

	public void addItem(Product prod) {
		if (itemExists(prod.productId)) 
			System.out.println("Item with same id already in the cart");
		else {
			productList.add(prod);
			System.out.println("Successfully added to cart");
		}
	}

	public void removeItem(Product product) {

		productList.remove(product);
		System.out.println("successfully removed from cart");

	}

	public void checkAndRemoveItem(Integer id) {	
		List<Product> filteredProductList= productList.stream()
				.filter(prod -> Objects.equals(id, prod.productId))
				.collect(Collectors.toList());
		
		if (filteredProductList.isEmpty())
			System.out.println("No item present with given id");
		else
			removeItem(filteredProductList.get(0));
	}

	public boolean itemExists(Integer id) {
		List<Product> filteredProductList= productList.stream()
				.filter(prod -> Objects.equals(id, prod.productId))
				.collect(Collectors.toList());
		
		return (!filteredProductList.isEmpty());
	}

	public void viewCart() {
		System.out.println("ID  |Name      |Price");
		System.out.println("_________________________________________");
		for (Product prod : productList) {
			System.out.print(prod.productId + "|");
			System.out.print(prod.name + "|");
			System.out.print(prod.price + "|\n");
		}

	}

	public void calculatePrice() {
		Double total = 0.0;
		for (Product prod : productList) {
			total = total + prod.price;
		}
		System.out.println("Total cost - " + total);

	}

}
