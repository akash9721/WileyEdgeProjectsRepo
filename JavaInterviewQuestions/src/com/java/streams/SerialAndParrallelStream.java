package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class SerialAndParrallelStream {
	public static void main(String[] args) {
		List<Integer> val = Arrays.asList(2, 4, 8, 10);
		val.stream().forEach(s -> System.out.println(s + " " + Thread.currentThread().getName()));
		val.parallelStream().forEach(s -> System.out.println(s + " " + Thread.currentThread().getName()));
		System.out.println("min element is: " + val.stream().mapToInt(x -> x).min().getAsInt());
		System.out.println("min ele using another way" + val.stream().min((a, b) -> a - b).get());
		System.out.println("max element is: " + val.stream().mapToInt(x -> x).max().getAsInt());
		System.out.println(val.stream().min((x, y) -> x - y).get());
		System.out.println(val.stream().max((x, y) -> x - y).get());
	}
}
