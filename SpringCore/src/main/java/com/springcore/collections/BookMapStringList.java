package com.springcore.collections;

import java.util.List;
import java.util.Map;

public class BookMapStringList {
	private Map<String, List<Book>> books;

	public Map<String, List<Book>> getBooks() {
		return books;
	}

	public void setBooks(Map<String, List<Book>> books) {
		this.books = books;
	}

	public void displayData() {
		for (Map.Entry<String, List<Book>> entry : books.entrySet()) {
			String key = entry.getKey();
			System.out.println(key);
			for (Book b : entry.getValue()) {
				System.out.print(b + "\n");
			}

		}
	}

}
