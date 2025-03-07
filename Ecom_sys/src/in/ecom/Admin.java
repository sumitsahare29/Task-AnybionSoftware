package in.ecom;

import java.util.ArrayList;

public class Admin extends User {

	public Admin(String name, String email, String password, String address) {
		super(name, email, password, address);
	}

	public void addProduct(ArrayList<Product> products, String productId, String name, double price,
			String description) {
		products.add(new Product(productId, name, price, description));
		System.out.println("Product added successfully!");
	}

	public void removeProduct(ArrayList<Product> products, String productId) {
		products.removeIf(product -> product.getProductId().equals(productId));
		System.out.println("Product removed successfully!");
	}
}
