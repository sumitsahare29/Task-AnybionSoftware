package com.lms;

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryManagementLogic {
	private ArrayList<Books> books = new ArrayList<Books>();
	private HashMap<Integer, Books> issuedBooks = new HashMap<Integer, Books>();

	// Add Books
	public void addBook(String title, String author, int bookId) {
		Books book = new Books(title, author, bookId);
		books.add(book);
		System.out.println("Book added successfully!");
	}

	// issue Book
	public void issueBook(int bookId, String dueDate) {
		Books book = findBookById(bookId);
		if (book != null && !book.isIssued()) {
			book.issueBook(dueDate);
			issuedBooks.put(bookId, book);
			System.out.println("Book issued successfully!");
		} else if (book == null) {
			System.err.println("Error: Book not found.");
		} else {
			System.err.println("Error: Book is already issued.");
		}
	}

	// Return Book
	public void returnBook(int bookId) {
		Books book = findBookById(bookId);
		if (book != null && book.isIssued()) {
			book.returnBook();
			issuedBooks.remove(bookId);
			System.out.println("Book returned successfully!");
		} else if (book == null) {
			System.err.println("Error: Book not found.");
		} else {
			System.err.println("Error: Book was not issued.");
		}
	}

	// Display Book
	public void displayAvailableBooks() {
		System.out.println("Available Books:");
		for (Books book : books) {
			if (!book.isIssued()) {
				System.out.println(book);
			}
		}
	}

	// Search Book by title
	public void searchBookByTitle(String title) {
		System.out.println("Searching for books with title: " + title);
		for (Books book : books) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				System.out.println(book);
			}
		}
	}

	// Search Book by auther
	public void searchBookByAuthor(String author) {
		System.out.println("Searching for books by author: " + author);
		for (Books book : books) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				System.out.println(book);
			}
		}
	}

	// find Book by Id
	private Books findBookById(int bookId) {
		for (Books book : books) {
			if (book.getBookId() == bookId) {
				return book;
			}
		}
		return null;
	}
}
