package com.java8features;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer, Integer> squ = i -> i * i;
		System.out.println(squ.apply(2));

		Function<Integer, Integer> qube = i -> i * i * i;
		System.out.println(qube.apply(2));

		// function chaining
		System.out.println("after function joining: " + squ.andThen(qube).apply(2));
		System.out.println("after function joining: " + squ.compose(qube).apply(2));
	}

}
