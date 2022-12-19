package com.StudentJava7AndJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SeprateStreamDemo {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(2, 6, 4, 33, 11, 8, 9, 45, 18, 2);

		System.out.println("some operation on arrays using stram");
		IntSummaryStatistics op = arr.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("max element is " + op.getMax());
		System.out.println("min element is " + op.getMin());
		System.out.println("sum of element is " + op.getSum());
		System.out.format("avg of element is %.2f\n", op.getAverage());
		System.out.println("Count no of element " + op.getCount());

		System.out.println();
		System.out.print("count distinct value ");
		System.out.println(arr.stream().distinct().count());

		System.out.println("sorted values");
		// arr.stream().sorted().forEach(System.out::println); // using method reference
		arr.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		arr.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
		System.out.println();

		System.out.println("updated list");
		arr.stream().map(x -> x * x).forEach(s -> System.out.print(s + " "));
		System.out.println();

		System.out.println("filtering values");
		arr.stream().distinct().filter(x -> x % 2 == 0).sorted().forEach(s -> System.out.print(s + " "));

	}

}
