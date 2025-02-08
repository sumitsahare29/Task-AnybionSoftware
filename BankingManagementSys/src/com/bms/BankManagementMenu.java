package com.bms;

import java.util.Scanner;

public class BankManagementMenu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankManagementLogic bankingSystem = new BankManagementLogic();
		int choice;

		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("---Banking Management System---");
			System.out.println("1. Create Account");
			System.out.println("2. Check Balance");
			System.out.println("3. Deposit Money");
			System.out.println("4. Withdraw Money");
			System.out.println("5. Transfer Money");
			System.out.println("6. View Transaction History");
			System.out.println("7. Exit");
			System.out.println("--------------------------------------------");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				// Create Account
				System.out.print("Enter your name: ");
				String name = scanner.nextLine();
				System.out.print("Enter account number: ");
				String accountNumber = scanner.nextLine();
				System.out.print("Enter PIN: ");
				String pin = scanner.nextLine();
				System.out.print("Enter initial deposit: ");
				double deposit = scanner.nextDouble();
				if (bankingSystem.createAccount(name, accountNumber, pin, deposit)) {
					System.out.println("Account created successfully!");
				} else {
					System.out.println("Account creation failed!");
				}
				break;

			case 2:
				// Check Balance
				System.out.print("Enter account number: ");
				accountNumber = scanner.nextLine();
				System.out.print("Enter PIN: ");
				pin = scanner.nextLine();
				double balance = bankingSystem.checkBalance(accountNumber, pin);
				if (balance != -1) {
					System.out.println("Your balance is: " + balance);
				} else {
					System.out.println("Invalid account or PIN.");
				}
				break;

			case 3:
				// Deposit Money
				System.out.print("Enter account number: ");
				accountNumber = scanner.nextLine();
				System.out.print("Enter amount to deposit: ");
				double depositAmount = scanner.nextDouble();
				if (bankingSystem.deposit(accountNumber, depositAmount)) {
					System.out.println("Deposit successful!");
				} else {
					System.out.println("Account not found.");
				}
				break;

			case 4:
				// Withdraw Money
				System.out.print("Enter account number: ");
				accountNumber = scanner.nextLine();
				System.out.print("Enter PIN: ");
				pin = scanner.nextLine();
				System.out.print("Enter amount to withdraw: ");
				double withdrawAmount = scanner.nextDouble();
				if (bankingSystem.withdraw(accountNumber, pin, withdrawAmount)) {
					System.out.println("Withdrawal successful!");
				} else {
					System.out.println("Insufficient balance or invalid PIN.");
				}
				break;

			case 5:
				// Transfer Money
				System.out.print("Enter your account number: ");
				String fromAccount = scanner.nextLine();
				System.out.print("Enter recipient account number: ");
				String toAccount = scanner.nextLine();
				System.out.print("Enter PIN: ");
				pin = scanner.nextLine();
				System.out.print("Enter amount to transfer: ");
				double transferAmount = scanner.nextDouble();
				if (bankingSystem.transfer(fromAccount, toAccount, pin, transferAmount)) {
					System.out.println("Transfer successful!");
				} else {
					System.out.println("Transfer failed. Check balance or PIN.");
				}
				break;

			case 6:
				// View Transaction History
				System.out.print("Enter account number: ");
				accountNumber = scanner.nextLine();
				bankingSystem.viewTransactionHistory(accountNumber);
				break;

			case 7:
				// Exit
				System.out.println("Exiting the system...");
				scanner.close();
				return;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
