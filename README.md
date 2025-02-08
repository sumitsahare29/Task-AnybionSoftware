# Library Management System

## Overview
This is a simple console-based Library Management System developed in Java. It allows users to manage books in a library by adding new books, issuing books to users, returning books, displaying available books, and searching for books by title or author.

## Features
- **Add Book**: Add books with a unique ID, title, and author.
- **Issue Book**: Issue a book to a user and track its due date.
- **Return Book**: Return an issued book and update its status.
- **Display Available Books**: View all books that are not currently issued.
- **Search Books**: Search for books by title or author.

## Class Overview

- **Books Class**: 
  - Represents a book with attributes such as ID, title, author, issued status, and due date.
  - Methods include getters, setters, and a method to display book details.

- **LibraryManagementLogic Class**: 
  - Manages a collection of books and operations such as adding, issuing, returning, and searching for books.
  - Contains methods to add a book, issue a book, return a book, display available books, and search books by title or author.

- **LibraryManagementMenu Class**: 
  - The main class that runs the program and provides the console interface for the user to interact with the LibraryManagementLogic system.



---



# Mobile Store Management System

## Overview

The **Mobile Store Management System** is a console-based Java application that allows a user to manage the inventory of a mobile store. The system includes functionalities for adding new mobiles and accessories, searching items by name or brand, managing stock levels, and displaying all available products with their details.

The system is built using **Object-Oriented Programming (OOP)** principles such as classes, objects, inheritance, and exception handling.


## Features

1. **Add New Products:**
   - Add new mobiles and accessories (like covers, glasses, etc.) to the store's inventory.
   
2. **Search for Products:**
   - Search products based on name or brand to quickly locate them in the storemanagementlogic file.
   
3. **Manage Stock Levels:**
   - Increase or decrease stock quantities for any product.
   
4. **Display All Products:**
   - View a list of all available products, including their details such as name, brand, price, and available quantity.


## Class Overview

- **Product (Base Class)**:
  - The base class representing a general product in the store.
  - Contains attributes: name, brand, price, and quantity.

- **Mobile (Subclass of Product)**:
  - Represents a mobile phone product in the store.
  - Inherits from the Product class and can include mobile-specific attributes and methods.

- **Accessory (Subclass of Product)**:
  - Represents an accessory (like phone covers or glasses) in the store.
  - Inherits from the Product class and adds accessory-specific behaviors.

- **StoreManagementLogic**:
  - Manages the collection of products in the store.
  - Provides methods for adding products, searching by name or brand, and manage stock quantities, display all product.

---


# Banking Management System (Console-Based)

## Overview

The Banking Management System is a simple, console-based Java application designed to handle basic banking operations such as account creation, balance inquiry, deposits, withdrawals, funds transfer, and transaction history. It uses **file handling** for persistent storage of account information and transaction data. This project is implemented using Object-Oriented Programming principles and includes robust error handling for invalid inputs and insufficient balance.

---

## Features

- **Account Creation**: Users can create a new account by providing their name, account number, PIN, and an initial deposit.
- **Balance Inquiry**: Users can check the balance of their account by entering the account number and PIN.
- **Money Deposit**: Users can deposit money into their account.
- **Money Withdrawal**: Users can withdraw money from their account, provided they enter the correct PIN and have sufficient funds.
- **Fund Transfer**: Allows users to transfer money from one account to another. Both accounts need to be verified using their PIN.
- **Transaction History**: Users can view a detailed history of all transactions made on their account (deposits, withdrawals, and transfers).
- **Persistent Storage**: Account information and transaction history are saved to a file (`AccountFile.txt`) for data persistence across sessions.

---

## Class Overview

### 1. **Account.java**
The `Account` class represents a customer's bank account and handles various operations related to the account.

- **Attributes**:
  - `name`: Customer's name.
  - `accountNumber`: Unique identifier for the account.
  - `pin`: Security PIN for account access.
  - `balance`: The current balance of the account.
  - `transactionHistory`: A list of all transactions (deposits, withdrawals, transfers) made on the account.

- **Methods**:
  - `deposit(double amount)`: Adds the specified amount to the account balance and logs the transaction.
  - `withdraw(double amount)`: Deducts the specified amount from the account balance if sufficient funds are available. Logs the transaction.
  - `transfer(Account toAccount, double amount)`: Transfers the specified amount from the current account to another account. Requires sufficient funds.
  - `getTransactionHistory()`: Returns a list of all transactions made on the account.
  - `verifyPin(String inputPin)`: Verifies the entered PIN with the account’s stored PIN.

### 2. **BankManagementLogic.java**
The `BankManagementLogic` class is responsible for managing all banking operations and business logic.

- **Attributes**:
  - `accounts`: A `HashMap` that stores account information using account numbers as the key.
  - `filePath`: The file path used for persistent storage of account data (`AccountFile.txt`).

- **Methods**:
  - `createAccount(String name, String accountNumber, String pin, double initialDeposit)`: Creates a new account and saves it in the `accounts` map.
  - `getAccount(String accountNumber)`: Retrieves the account associated with the provided account number.
  - `deposit(String accountNumber, double amount)`: Deposits money into the specified account.
  - `withdraw(String accountNumber, String pin, double amount)`: Withdraws money from the account after verifying the PIN.
  - `transfer(String fromAccountNumber, String toAccountNumber, String pin, double amount)`: Transfers money between two accounts after verifying the PIN.
  - `viewTransactionHistory(String accountNumber)`: Displays the transaction history for the specified account.
  - `checkBalance(String accountNumber, String pin)`: Checks the balance of the specified account after PIN verification.
  - **File Handling**: The `loadAccounts()` and `saveAccounts()` methods manage reading from and writing to the file for data persistence.

### 3. **BankManagementMenu.java**
The `BankManagementMenu` class provides the user interface for interacting with the banking system through the console.

- **Methods**:
  - `main(String[] args)`: Displays the main menu, allowing users to select an action (create account, check balance, deposit, withdraw, transfer, view transaction history, exit).
  - The menu allows users to input their data (e.g., account number, PIN, amount to deposit/withdraw/transfer), and it calls the relevant methods from the `BankManagementLogic` class to perform the corresponding operations.

---


