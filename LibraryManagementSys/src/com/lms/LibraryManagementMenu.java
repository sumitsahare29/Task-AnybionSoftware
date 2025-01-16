
package com.lms;

import java.util.Scanner;

public class LibraryManagementMenu {
	private static LibraryManagementLogic lml = new LibraryManagementLogic();
	private static Scanner scanner = new Scanner(System.in);

	private static void addNewBook() {
		System.out.print("Enter book title: ");
		String title = scanner.nextLine();
		System.out.print("Enter book author: ");
		String author = scanner.nextLine();
		System.out.print("Enter book ID: ");
		int bookId = scanner.nextInt();
		scanner.nextLine();
		lml.addBook(title, author, bookId);
	}

	private static void issueBook() {
		System.out.print("Enter book ID to issue: ");
		int bookId = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		System.out.print("Enter due date (YYYY-MM-DD): ");
		String dueDate = scanner.nextLine();
		lml.issueBook(bookId, dueDate);
	}

	private static void returnBook() {
		System.out.print("Enter book ID to return: ");
		int bookId = scanner.nextInt();
		scanner.nextLine();
		lml.returnBook(bookId);
	}

	private static void searchBookByTitle() {
		System.out.print("Enter book title to search: ");
		String title = scanner.nextLine();
		lml.searchBookByTitle(title);
	}

	private static void searchBookByAuthor() {
		System.out.print("Enter author name to search: ");
		String author = scanner.nextLine();
		lml.searchBookByAuthor(author);
	}

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("-----------------------------------");
			System.out.println("--- Library Management System ---");
			System.out.println("1. Add book");
			System.out.println("2. Issue book");
			System.out.println("3. Return book");
			System.out.println("4. Display available books");
			System.out.println("5. Search for a book by title");
			System.out.println("6. Search for a book by author");
			System.out.println("7. Exit");
			System.out.println("-----------------------------------");

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				addNewBook();
				break;

			case 2:
				issueBook();
				break;

			case 3:
				returnBook();
				break;

			case 4:
				lml.displayAvailableBooks();
				break;

			case 5:
				searchBookByTitle();
				break;

			case 6:
				searchBookByAuthor();
				break;

			case 7:
				System.err.println("Exit");
				break;

			default:
				System.err.println("Invalid choice!");
			}
		} while (choice != 7);
	}
}
