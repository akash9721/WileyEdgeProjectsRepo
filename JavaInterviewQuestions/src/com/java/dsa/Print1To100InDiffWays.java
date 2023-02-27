package com.java.dsa;

import java.util.stream.IntStream;

public class Print1To100InDiffWays {

	// 1. without using any no
	private static void withoutUsingNo1() {
		int first = 'a' / 'a'; // 1
		String last = "..........";// 10
		for (int i = first; i <= (last.length() * last.length()); i++) {
			System.out.println(i);
		}
	}

	// 2. without using any no, using unicode value
	private static void withoutUsingNoUsingUnicode() {
		int first = 'a' / 'a'; // 1
		// unicode of d is 100
		for (int i = first; i <= 'd'; i++) {
			System.out.println(i);
		}
	}

	// 3. using recursion
	private static void usingRecursion(int start) {
		if (start <= 100) {
			System.out.println(start);
			start++;
			usingRecursion(start);
		}

	}

	// 4. using stream api java8
	private static void usingStreamJava8() {
		IntStream.range(1, 101).forEach(System.out::println);
	}

	// 5. using while loop
	private static void usingWhileLoop() {
		int i = 1;
		while (i <= 100) {
			System.out.print(i + " ");
			i++;
		}
	}

	// 6. using for loop
	private static void usingForLoop() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
	}

	private static void addTwoNo(int a, int b) {
		while (a > 0) {
			b++;
			a--;
		}
		while (a < 0) {
			b--;
			a++;
		}
		System.out.println(b);
	}

	public static void main(String[] args) {
		// withoutUsingNo1();
		// withoutUsingNoUsingUnicode();
		// usingRecursion(1);
		// usingStreamJava8();
		// usingForLoop();
		// usingWhileLoop();
		addTwoNo(-4, 1);
	}

}
