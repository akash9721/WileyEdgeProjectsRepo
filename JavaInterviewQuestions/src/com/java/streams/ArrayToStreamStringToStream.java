package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToStreamStringToStream {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 3, 5, 6 };
		IntStream arrstream = Arrays.stream(a);
		arrstream.filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

		String strarr[] = { "akash", "kumar", "kashyap", "jagdeep" };
		Stream<String> stream = Arrays.stream(strarr);
		stream.filter(e -> e.startsWith("k")).forEach(System.out::println);

		// conacatination of two list
		List<Integer> l1 = Arrays.asList(2, 4, 3, 5, 6);
		List<Integer> l2 = Arrays.asList(1, 9, 33, 12, 3, 6);
		Stream<Integer> alllist = Stream.concat(l1.stream(), l2.stream());
		List<Integer> collect = alllist.collect(Collectors.toList());
		System.out.println(collect);
		collect.stream().sorted().distinct().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println(collect.stream().max((x1, x2) -> x1 - x2).get());
		System.out.println(collect.stream().min((x1, x2) -> x1 - x2).get());

		System.out.println();
		List<String> str = Arrays.asList("akash", "sonam", "akansha", "yash", "poojita");
		String collect2 = str.stream().map(e -> e.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(collect2);
	}

}
