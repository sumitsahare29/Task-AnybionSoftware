package com.msms;

public class Accessory extends Product {

	public String type;

	public Accessory(String name, String brand, double price, int quantity, String type) {
		super(name, brand, price, quantity);
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Accessory [name=" + name + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity
				+ ", type=" + type + "]";
	}

}
