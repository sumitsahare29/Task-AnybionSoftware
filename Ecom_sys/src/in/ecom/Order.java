package in.ecom;

import java.util.Date;

public class Order {

	private String orderId;
	private User user;
	private double totalAmount;
	private Date date;

	public Order(String orderId, User user, double totalAmount) {
		this.orderId = orderId;
		this.user = user;
		this.totalAmount = totalAmount;
		this.date = new Date();
	}

	public String getOrderId() {
		return orderId;
	}

	public void displayOrderDetails() {
		System.out.println("Order ID: " + orderId);
		System.out.println("User: " + user.getName());
		System.out.println("Total Amount: " + totalAmount);
		System.out.println("Order Date: " + date);
	}
}
