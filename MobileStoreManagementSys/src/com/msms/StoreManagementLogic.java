package com.msms;

import java.util.ArrayList;
import java.util.List;

public class StoreManagementLogic {

	private List<Product> list = new ArrayList<Product>();

	public void addProduct(Product product) {
		list.add(product);
		System.out.println("Product is added!");
	}

	public void searchProduct(String search) {
		boolean found = false;
		for (Product product : list) {
			if (product.getName().equalsIgnoreCase(search) || product.getBrand().equalsIgnoreCase(search)) {
				System.out.println(product);
				found = true;
			}
		}
		if (!found) {
			System.err.println("Product not found!");
		}
	}

	public void manageStock(String name, int changeQuantity) {
		for (Product product : list) {
			if (product.getName().equalsIgnoreCase(name)) {
				int newQuantity = product.getQuantity() + changeQuantity;
				if (newQuantity < 0) {
					System.err.println("Insufficient fund");
				} else {
					product.setQuantity(newQuantity);
					System.out.println("Stock updated");
				}
			}

		}

	}

	public void displayProduct() {
		if (list.isEmpty()) {
			System.err.println("Product is not available");
		} else {
			for (Product product : list) {
				System.out.println(product);
			}
		}
	}

}
