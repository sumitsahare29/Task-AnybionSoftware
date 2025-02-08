package com.bms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class BankManagementLogic {

	private Map<String, Account> accounts; // Store accounts by account number
	private final String filePath = "D://AccountFile.txt"; // File for data persistence

	public BankManagementLogic() {
		accounts = new HashMap<>();
		loadAccounts(); // Load accounts from file
	}

	// Load accounts from the file
	private void loadAccounts() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
			accounts = (Map<String, Account>) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("No previous data found. Starting fresh.");
		}
	}

	// Save accounts to the file
	private void saveAccounts() {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
			out.writeObject(accounts);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Create a new account
	public boolean createAccount(String name, String accountNumber, String pin, double initialDeposit) {
		if (accounts.containsKey(accountNumber)) {
			System.out.println("Account number already exists!");
			return false;
		}
		Account newAccount = new Account(name, accountNumber, pin, initialDeposit);
		accounts.put(accountNumber, newAccount);
		saveAccounts();
		return true;
	}

	// Retrieve an account by account number
	public Account getAccount(String accountNumber) {
		return accounts.get(accountNumber);
	}

	// Deposit money into an account
	public boolean deposit(String accountNumber, double amount) {
		Account account = accounts.get(accountNumber);
		if (account != null) {
			account.deposit(amount);
			saveAccounts();
			return true;
		}
		return false;
	}

	// Withdraw money from an account
	public boolean withdraw(String accountNumber, String pin, double amount) {
		Account account = accounts.get(accountNumber);
		if (account != null && account.verifyPin(pin)) {
			return account.withdraw(amount);
		}
		return false;
	}

	// Transfer money between two accounts
	public boolean transfer(String fromAccountNumber, String toAccountNumber, String pin, double amount) {
		Account fromAccount = accounts.get(fromAccountNumber);
		Account toAccount = accounts.get(toAccountNumber);
		if (fromAccount != null && toAccount != null && fromAccount.verifyPin(pin)) {
			return fromAccount.transfer(toAccount, amount);
		}
		return false;
	}

	// View transaction history
	public void viewTransactionHistory(String accountNumber) {
		Account account = accounts.get(accountNumber);
		if (account != null) {
			System.out.println("Transaction History for Account: " + accountNumber);
			for (String transaction : account.getTransactionHistory()) {
				System.out.println(transaction);
			}
		} else {
			System.out.println("Account not found.");
		}
	}

	// Check account balance
	public double checkBalance(String accountNumber, String pin) {
		Account account = accounts.get(accountNumber);
		if (account != null && account.verifyPin(pin)) {
			return account.getBalance();
		}
		return -1; // Invalid PIN or account
	}
}
