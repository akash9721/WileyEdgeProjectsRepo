package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductApp {
	public static void main(String[] args) {
		Product p1 = new Product(101, "Java", "Book", 150);
		Product p2 = new Product(102, "Spring", "Book", 300);
		Product p3 = new Product(103, "Html", "Book", 100);
		Product p4 = new Product(104, "Css", "Book", 250);

		Product p5 = new Product(105, "Nokia", "Phone", 2550);
		Product p6 = new Product(106, "Samsung", "Phone", 3000);
		Product p7 = new Product(107, "Redmi", "Phone", 4330);

		List<Product> pro = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

		// 1.Get the list of all the products that belongs to the book cat. and
		// price>200
		pro.stream().filter(p -> p.getProductCatagry().equals("Book")).filter(p -> p.getProductPrice() > 200)
				.forEach(System.out::println);

		// 2. 2nd highest price
		Optional<Integer> findFirst = pro.stream().map(Product::getProductPrice).sorted(Comparator.reverseOrder())
				.skip(1).findFirst();
		System.out.println("\nsecond highest price: " + findFirst.get());

		// 3.highest price in each categry
		System.out.println();
		System.out.println("highest price in each categry");
		Map<String, Product> collect = pro.stream()
				.collect(Collectors.groupingBy(Product::getProductCatagry, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingInt(Product::getProductPrice)), Optional::get)));
		System.out.println(collect);

		// 4. No of product in each categry
		System.out.println("\nNo of product in each categry");
		Map<String, Long> noofp = pro.stream()
				.collect(Collectors.groupingBy(Product::getProductCatagry, Collectors.counting()));
		System.out.println(noofp);

		// 5. Count no of occurence of each element
		List<Integer> arr = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		Map<Integer, Long> collect2 = arr.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect2.forEach((k, v) -> System.out.println(k + "-" + v));

	}
}
