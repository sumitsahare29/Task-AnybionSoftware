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


# Banking Management System

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

# E-Commerce System

## Overview

This project implements a simple e-commerce system in Java. It allows users to register, login, browse products, add products to the shopping cart, checkout, and view order history. The system also provides an admin interface that allows administrators to add and remove products from the product catalog. The system simulates a basic e-commerce platform with product management, user authentication, shopping cart management, and order history tracking.

## Features

1. **User Registration and Login:**
   - Users can register by providing their name, email, password, and address.
   - Registered users can log in with their email and password.

2. **Product Management (Admin only):**
   - Admin can add new products to the product catalog.
   - Admin can remove existing products from the catalog.

3. **Product Browsing:**
   - All users (logged in or not) can view the list of available products with their details (ID, name, price, and description).

4. **Shopping Cart:**
   - Users can add products to their shopping cart.
   - Users can view and manage the contents of their cart.

5. **Checkout:**
   - Users can proceed to checkout and choose a payment method (Credit Card, UPI, or Cash on Delivery).
   - Upon successful payment, the order is placed and added to the order history.

6. **Order History:**
   - Logged-in users can view their past orders with detailed information (Order ID, total amount, order date).

7. **Payment Processing:**
   - The system simulates the processing of payments through different payment methods.

## Class Overview

### 1. **Admin Class**
   - Extends the `User` class and provides administrative functionalities.
   - **Methods:**
     - `addProduct(ArrayList<Product> products, String productId, String name, double price, String description)`: Adds a new product to the product list.
     - `removeProduct(ArrayList<Product> products, String productId)`: Removes a product from the product list.

### 2. **EComSystem Class**
   - The main class that runs the application and contains the user interface.
   - **Methods:**
     - `registerUser()`: Registers a new user.
     - `loginUser()`: Allows a user to log in.
     - `viewProducts()`: Displays available products.
     - `addToCart()`: Adds a product to the shopping cart.
     - `checkout()`: Processes the checkout and payment for the cart.
     - `viewOrderHistory()`: Displays the user's order history.

### 3. **Order Class**
   - Represents an order placed by a user.
   - **Fields:**
     - `orderId`: Unique identifier for the order.
     - `user`: The user who placed the order.
     - `totalAmount`: Total price of the order.
     - `date`: Date when the order was placed.
   - **Methods:**
     - `displayOrderDetails()`: Displays the details of the order (Order ID, user name, total amount, and order date).

### 4. **OrderHistory Class**
   - Manages a collection of orders.
   - **Fields:**
     - `orders`: A list of all orders placed by users.
   - **Methods:**
     - `addOrder(Order order)`: Adds an order to the order history.
     - `viewOrderHistory()`: Displays the order history.

### 5. **Payment Class**
   - Simulates the payment processing system.
   - **Methods:**
     - `processPayment(double amount, String paymentMethod)`: Simulates payment processing for a given amount and payment method.

### 6. **Product Class**
   - Represents a product in the catalog.
   - **Fields:**
     - `productId`: Unique identifier for the product.
     - `name`: The name of the product.
     - `price`: The price of the product.
     - `description`: A description of the product.
   - **Methods:**
     - `toString()`: Returns a string representation of the product details.

### 7. **ShoppingCart Class**
   - Represents the shopping cart where users can add and remove products.
   - **Fields:**
     - `cartItems`: A list of products in the shopping cart.
   - **Methods:**
     - `addProductToCart(Product product)`: Adds a product to the shopping cart.
     - `removeProductFromCart(String productId)`: Removes a product from the shopping cart.
     - `viewCart()`: Displays the items in the shopping cart.
     - `checkout()`: Calculates and returns the total amount of the cart.

### 8. **User Class**
   - Represents a user of the system.
   - **Fields:**
     - `name`: The name of the user.
     - `email`: The email address of the user.
     - `password`: The password for user authentication.
     - `address`: The address of the user.
   - **Methods:**
     - `getEmail()`: Returns the user's email.
     - `getPassword()`: Returns the user's password.
     - `getName()`: Returns the user's name.
     - `getAddress()`: Returns the user's address.
     - `displayInfo()`: Displays the user's personal information.

## How to Use

1. **Run the Application:**
   - Run the `EComSystem` class to start the system.

2. **Registration and Login:**
   - Register a new user by selecting option 1 and providing the required details.
   - Log in by selecting option 2 and entering your credentials.

3. **Browse Products:**
   - View available products by selecting option 3.

4. **Add to Cart:**
   - Add products to your cart by selecting option 4 and entering the product ID.

5. **Checkout:**
   - Checkout your cart and make payment by selecting option 5.

6. **View Order History:**
   - View past orders by selecting option 6.



