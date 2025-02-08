package com.bms;

import java.io.Serializable;
import java.util.ArrayList;

public class Account implements Serializable {
	private String name;
	private String accountNumber;
	private String pin;
	private double balance;
	private ArrayList<String> transactionHistory;

	// Constructor to create a new account
	public Account(String name, String accountNumber, String pin, double initialDeposit) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = initialDeposit;
		this.transactionHistory = new ArrayList<>();
		addTransaction("Account created with initial deposit: " + initialDeposit);
	}

	// Getters and Setters
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getPin() {
		return pin;
	}

	public double getBalance() {
		return balance;
	}

	public ArrayList<String> getTransactionHistory() {
		return transactionHistory;
	}

	// Method to deposit money
	public void deposit(double amount) {
		this.balance += amount;
		addTransaction("Deposited: " + amount);
	}

	// Method to withdraw money
	public boolean withdraw(double amount) {
		if (amount <= balance) {
			this.balance -= amount;
			addTransaction("Withdrew: " + amount);
			return true;
		} else {
			return false; // Insufficient balance
		}
	}

	// Method to transfer money between accounts
	public boolean transfer(Account toAccount, double amount) {
		if (this.withdraw(amount)) {
			toAccount.deposit(amount);
			addTransaction("Transferred: " + amount + " to Account: " + toAccount.getAccountNumber());
			return true;
		}
		return false; // Insufficient balance
	}

	// Add a transaction to history
	private void addTransaction(String transaction) {
		transactionHistory.add(transaction);
	}

	// Check PIN
	public boolean verifyPin(String inputPin) {
		return this.pin.equals(inputPin);
	}
}
