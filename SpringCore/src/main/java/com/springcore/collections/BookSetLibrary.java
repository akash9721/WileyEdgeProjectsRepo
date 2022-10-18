package com.springcore.collections;

import java.util.HashSet;

public class BookSetLibrary {
	private HashSet<Book> books;

	public HashSet<Book> getBooks() {
		return books;
	}

	public void setBooks(HashSet<Book> books) {
		this.books = books;
	}

	public void display() {
		for (Book b : books) {
			System.out.print(b + "\n");
		}
	}

}
