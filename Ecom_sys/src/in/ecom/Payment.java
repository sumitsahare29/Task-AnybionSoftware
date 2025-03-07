package in.ecom;

public class Payment {

	public static void processPayment(double amount, String paymentMethod) {
		System.out.println("Processing payment of Rs. " + amount + " via " + paymentMethod);
		System.out.println("Payment successful!");
	}
}
