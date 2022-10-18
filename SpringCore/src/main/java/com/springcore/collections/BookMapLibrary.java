package com.springcore.collections;

import java.util.Map;

public class BookMapLibrary {
	private Map<String, Book> books;

	public Map<String, Book> getBooks() {
		return books;
	}

	public void setBooks(Map<String, Book> books) {
		this.books = books;
	}

	public void displayMapdata() {
		for (Map.Entry<String, Book> entry : books.entrySet()) {
			System.out.print(entry.getKey() + "->>>" + entry.getValue() + "\n");
		}
	}

}
