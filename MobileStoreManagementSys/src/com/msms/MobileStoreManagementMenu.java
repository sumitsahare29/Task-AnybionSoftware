package com.msms;

import java.util.Scanner;

public class MobileStoreManagementMenu {

	public static void main(String[] args) {

		StoreManagementLogic sManage = new StoreManagementLogic();
		Scanner sc = new Scanner(System.in);
		int choice;
		// menu
		do {
			System.out.println("----------------------------------------");
			System.out.println("- Mobile Store Management System -");
			System.out.println("1. Add New Product");
			System.out.println("2. Search Product by Name or Brand");
			System.out.println("3. Manage Stock level");
			System.out.println("4. Display All Products");
			System.out.println("5. Exit");
			System.out.println("----------------------------------------");

			System.out.println("Choose an option: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				// add product
				System.out.print("Enter type (mobile/accessory): ");
				String type = sc.next();
				System.out.print("Enter name: ");
				String name = sc.next();
				System.out.print("Enter brand: ");
				String brand = sc.next();
				System.out.print("Enter price: ");
				double price = sc.nextDouble();
				System.out.print("Enter quantity: ");
				int quantity = sc.nextInt();

				if (type.equalsIgnoreCase("mobile")) {
					System.out.println("Enter model: ");
					String model = sc.next();
					sManage.addProduct(new Mobile(name, brand, price, quantity, model));
				} else if (type.equalsIgnoreCase("accessory")) {
					System.out.println("Enter accessory type: ");
					String accessoryType = sc.next();
					sManage.addProduct(new Accessory(name, brand, price, quantity, accessoryType));
				} else {
					System.err.println("Invalid product type!");
				}
				break;

			case 2:
				// search product
				System.out.print("Enter name or brand to search: ");
				String search = sc.next();
				sManage.searchProduct(search);
				break;

			case 3:
				// manage stock
				System.out.println("Enter product name: ");
				String productName = sc.next();
				System.out.println("Enter quantity to add/remove (use negative for removal)");
				int changeQuantity = sc.nextInt();
				sManage.manageStock(productName, changeQuantity);
				break;

			case 4:
				// display all product
				sManage.displayProduct();
				break;

			case 5:
				// exit
				System.err.println("Exit!");
				break;

			default:
				// exit
				System.err.println("Try again!");
			}
		} while (choice != 5);
	}
}
