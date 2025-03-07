package in.ecom;

import java.io.Serializable;

public class User implements Serializable {

	private String name;
	private String email;
	private String password;
	private String address;

	public User(String name, String email, String password, String address) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Address: " + address);
	}
}
