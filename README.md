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



