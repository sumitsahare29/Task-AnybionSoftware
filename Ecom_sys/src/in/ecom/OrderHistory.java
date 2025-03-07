package in.ecom;

import java.util.ArrayList;

public class OrderHistory {

	ArrayList<Order> orders = new ArrayList<>();

	public void addOrder(Order order) {
		orders.add(order);
	}

	public void viewOrderHistory() {
		if (orders.isEmpty()) {
			System.out.println("No orders placed yet.");
		} else {
			for (Order order : orders) {
				order.displayOrderDetails();
			}
		}
	}
}
