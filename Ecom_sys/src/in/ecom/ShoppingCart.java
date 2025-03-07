package in.ecom;

import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Product> cartItems = new ArrayList<>();

	public void addProductToCart(Product product) {
		cartItems.add(product);
		System.out.println("Added to cart: " + product.getName());
	}

	public void removeProductFromCart(String productId) {
		cartItems.removeIf(item -> item.getProductId().equals(productId));
		System.out.println("Removed from cart.");
	}

	public void viewCart() {
		if (cartItems.isEmpty()) {
			System.out.println("Your cart is empty.");
		} else {
			for (Product product : cartItems) {
				System.out.println(product);
			}
		}
	}

	public double checkout() {
		double total = 0;
		for (Product product : cartItems) {
			total += product.getPrice();
		}
		System.out.println("Total amount: " + total);
		return total;
	}
}
