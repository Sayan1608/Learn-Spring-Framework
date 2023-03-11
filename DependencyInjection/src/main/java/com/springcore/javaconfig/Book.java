package com.springcore.javaconfig;

public class Book {
	
	private String bookTitle;

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + "]";
	}
}
