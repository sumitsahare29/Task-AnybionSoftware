package in.ecom;

import java.util.ArrayList;
import java.util.Scanner;

public class EComSystem {

	private static ArrayList<Product> products = new ArrayList<>();
	private static ArrayList<User> users = new ArrayList<>();
	private static Admin admin = new Admin("Admin", "admin@ecommerce.com", "admin123", "Admin Address");
	private static User currentUser = null;
	private static ShoppingCart shoppingCart = new ShoppingCart();
	private static OrderHistory orderHistory = new OrderHistory();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Sample products for admin
		admin.addProduct(products, "101", "Computer", 51000, "Latest Computer");
		admin.addProduct(products, "102", "Fan", 1500, "Not expensive but good Fan");

		while (true) {
			System.out.println("----E-Commerce System----");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. View Products");
			System.out.println("4. Add to Cart");
			System.out.println("5. Checkout");
			System.out.println("6. View Order History");
			System.out.println("7. Exit");
			System.out.println("-------------------------");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				registerUser();
				break;
			case 2:
				loginUser();
				break;
			case 3:
				viewProducts();
				break;
			case 4:
				addToCart();
				break;
			case 5:
				checkout();
				break;
			case 6:
				viewOrderHistory();
				break;
			case 7:
				System.out.println("Exiting...");
				return;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}

	private static void registerUser() {
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter email: ");
		String email = sc.nextLine();
		System.out.print("Enter password: ");
		String password = sc.nextLine();
		System.out.print("Enter address: ");
		String address = sc.nextLine();
		users.add(new User(name, email, password, address));
		System.out.println("Registration successful!");
	}

	private static void loginUser() {
		System.out.print("Enter email: ");
		String email = sc.nextLine();
		System.out.print("Enter password: ");
		String password = sc.nextLine();
		for (User user : users) {
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				currentUser = user;
				System.out.println("Login successful!");
				return;
			}
		}
		System.out.println("Invalid credentials!");
	}

	private static void viewProducts() {
		if (products.isEmpty()) {
			System.out.println("No products available.");
		} else {
			for (Product product : products) {
				System.out.println(product);
			}
		}
	}

	private static void addToCart() {
		if (currentUser == null) {
			System.out.println("You need to login first.");
			return;
		}

		System.out.print("Enter product ID to add to cart: ");
		String productId = sc.nextLine();
		for (Product product : products) {
			if (product.getProductId().equals(productId)) {
				shoppingCart.addProductToCart(product);
				return;
			}
		}
		System.out.println("Product not found!");
	}

	private static void checkout() {
		if (currentUser == null) {
			System.out.println("You need to login first.");
			return;
		}

		shoppingCart.viewCart();
		double totalAmount = shoppingCart.checkout();
		System.out.print("Choose payment method (Credit Card, UPI, COD): ");
		String paymentMethod = sc.nextLine();
		Payment.processPayment(totalAmount, paymentMethod);

		Order order = new Order("O" + (orderHistory.orders.size() + 1), currentUser, totalAmount);
		orderHistory.addOrder(order);
		System.out.println("Order placed successfully!");
	}

	private static void viewOrderHistory() {
		if (currentUser == null) {
			System.out.println("You need to login first.");
			return;
		}
		orderHistory.viewOrderHistory();
	}
}
