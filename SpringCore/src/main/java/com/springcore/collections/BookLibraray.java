package com.springcore.collections;

import java.util.List;

public class BookLibraray {
	private List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void showBook() {
		for (Book b : books) {
			System.out.print(b + "\n");
		}
	}

	@Override
	public String toString() {
		return "BookLibraray [books=" + books + "]";
	}

}
