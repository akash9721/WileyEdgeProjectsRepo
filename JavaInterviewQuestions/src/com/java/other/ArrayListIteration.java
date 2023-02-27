package com.java.other;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIteration {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("papaya");
		fruits.add("lichi");

		// 1. using java 8 for each lambda function
		System.out.println("\n-----------using foreach lambda expression--------------");
		fruits.forEach(s -> System.out.println(s));
		// using method reference
		fruits.forEach(System.out::println);

		// 2. using iterator
		System.out.println("\n-----------using iterator--------------");
		Iterator it = fruits.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 3. using listiterator
		System.out.println("\n-----------using Listiterator--------------");
		ListIterator li = fruits.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		// 4. using for each loop
		System.out.println("\n-----------using for each loop--------------");
		for (String str : fruits) {
			System.out.println(str);
		}

		// 5. using simple for loop
		System.out.println("\n-----------using simple for loop--------------");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}

		// 6. using listiterator in reverse order
		System.out.println("\n-----------using Listiterator in reverse order--------------");
		ListIterator<String> ltr = fruits.listIterator(fruits.size());
		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
	}

}
