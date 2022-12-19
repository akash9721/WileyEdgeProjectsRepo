package com.java8features;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionInterfaceDemo {
	public static void main(String[] args) {
		// bipredicate
		BiPredicate<Integer, Integer> sumis = (a, b) -> a + b >= 5;
		System.out.println(sumis.test(5, 2));
		System.out.println(sumis.test(3, 1));

		// biFunction
		BiFunction<Integer, Integer, Integer> fun = (a, b) -> (a * b);
		System.out.println(fun.apply(5, 6));
	}

}
