package com.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateele {
	public static void main(String[] args) {
		List<Integer> ele = Arrays.asList(10, 28, 87, 10, 20, 76, 28, 80, 10);
		Set<Integer> set = new HashSet<Integer>();
		// this will print only duplicate element
		ele.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));

		ele.stream().limit(5).forEach(s -> System.out.print(s + " "));
		ele.stream().skip(5).forEach(System.out::println); // method reference
		System.out.println("sum of no is: " + ele.stream().mapToInt(x -> x).sum());
		System.out.println("sum of no using reduce: " + ele.stream().map(x -> x).reduce(0, (sum, x) -> sum + x));
		System.out.println("even no are: ");
		ele.stream().filter(x -> x % 2 == 0).forEach(s -> System.out.print(s + " "));
		System.out.println("\nno of element: " + ele.stream().mapToInt(x -> x).count());
		System.out.println("max element is: " + ele.stream().mapToInt(x -> x).max().getAsInt());
		System.out.println("min element is: " + ele.stream().mapToInt(x -> x).min().getAsInt());
		System.out.println("avg of element is: " + ele.stream().mapToInt(x -> x).average().getAsDouble());
		ele.stream().distinct().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		Integer secbig = ele.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secbig);
	}

}
