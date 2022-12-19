package com.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamOfMethod {
	public static void main(String[] args) {
		System.out.println("string to stream-------------------------------------------------");
		String[] str = { "akash", "vikash", "akshay", "prabh", "shivani" };
		Stream.of(str).filter(s -> s.startsWith("a")).forEach(s -> System.out.println(s));

		System.out.println("integer to stream-------------------------------------------------");
		int a[] = { 2, 4, 6, 1, 3, 7, 4 };
		Stream.of(a).forEach(s -> System.out.println(s));

		System.out.println("integer array to stream-------------------------------------------------");
		Integer arr[] = { 10, 20, 30, 2, 5, 33, 12, 44 };
		System.out.println("get second max no: ");
		Integer val = Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(val);
	}

}
