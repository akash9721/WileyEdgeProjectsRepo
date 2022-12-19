package com.java8features;

import java.util.function.Predicate;

public class PredicatesDemo {
	public static void main(String[] args) {
		Predicate<String> pred1 = (s) -> s.length() > 5;
		System.out.println(pred1.test("akash kumar"));

		Predicate<String> pred2 = (s) -> s.length() % 2 == 0;
		System.out.println(pred2.test("akash kumar"));

		// predicate joining
		// 3 way to join
		// 1. and
		// 2. or
		// 3. negate

		// if you want check 2 conditions
		// 1. to check length of string>5
		// 2. to check if length is even

		System.out.println("after merging two predicate: " + pred1.and(pred2).test("akash kumar"));
		System.out.println("after merging two predicate: " + pred1.or(pred2).test("akash kumar"));
	}
}
