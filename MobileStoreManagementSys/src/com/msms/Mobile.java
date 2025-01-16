package com.msms;

public class Mobile extends Product {

	public String model;

	public Mobile(String name, String brand, double price, int quantity, String model) {
		super(name, brand, price, quantity);
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + ", model="
				+ model + "]";
	}
}
