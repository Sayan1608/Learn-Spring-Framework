package com.springcore.javaconfig;

public class Student {
	
	private Book book;
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void study() {
		System.out.println("Student is studying");
	}

	@Override
	public String toString() {
		return "Student [book=" + book + "]";
	}
}
