package com.StudentJava7AndJava8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo2 {
	public static void main(String[] args) {

		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("akash", 2);
		mp.put("vikash", 5);
		mp.put("khusbu", 8);
		mp.put("pawan", 51);
		mp.put("subhash", 3);

		///////////// map
		System.out.println("-----------------------------------");
		mp.forEach((k, v) -> System.out.println(k + " : " + v));

		System.out.println();
		Set<String> set = new LinkedHashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		List<Integer> arr = Arrays.asList(2, 3, 6, 4, 6, 8, 2, 2);

		List<Integer> res = arr.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(res);
		System.out.println(arr.stream().map(x -> x).reduce(0, (sum, x) -> sum + x));
		System.out.println(arr.stream().mapToInt(x -> x).sum());
		System.out.println("maximum element is: " + arr.stream().mapToInt(x -> x).max().getAsInt());
		System.out.println("minimum element is: " + arr.stream().mapToInt(x -> x).min().getAsInt());
		System.out.println("count no 2 of element");
		System.out.println(arr.stream().filter(e -> e.equals(2)).count());
		System.out.println("total no of element");
		System.out.println(arr.stream().map(x -> x).count());

	}

}
