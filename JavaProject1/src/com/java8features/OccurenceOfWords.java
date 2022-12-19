package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfWords {
	public static void main(String[] args) {
		String str = "Hi there akash kumar is there akash kashyap";
		List<String> list = Arrays.asList(str.split(" "));
		Map<String, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
		collect.forEach((k, v) -> System.out.println(k + "->" + v));
	}

}
