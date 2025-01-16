package com.lms;

public class Books {
	private String title;
	private String author;
	private int bookId;
	private boolean isIssued;
	private String dueDate;

	public Books(String title, String author, int bookId) {
		this.title = title;
		this.author = author;
		this.bookId = bookId;
		this.isIssued = false;
		this.dueDate = null;
	}

	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isIssued() {
		return isIssued;
	}

	public void issueBook(String dueDate) {
		this.isIssued = true;
		this.dueDate = dueDate;
	}

	public void returnBook() {
		this.isIssued = false;
		this.dueDate = null;
	}

	public String getDueDate() {
		return dueDate;
	}

	@Override
	public String toString() {
		return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author
				+ (isIssued ? ", Issued, Due Date: " + dueDate : ", Available");
	}
}
