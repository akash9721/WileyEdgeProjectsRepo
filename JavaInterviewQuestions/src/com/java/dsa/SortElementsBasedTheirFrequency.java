package com.java.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortElementsBasedTheirFrequency {

	private static void sortBasedOnFre(String str) {
		String arr[] = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(" All the elements with their frequency: ");
		map.forEach((k, v) -> System.out.println(k + "->" + v));

		System.out.println("\n sort according to keys: ");
		Set<Entry<String, Integer>> entrySet1 = map.entrySet();
		List<Entry<String, Integer>> list1 = new ArrayList<Map.Entry<String, Integer>>(entrySet1);
		Collections.sort(list1, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareToIgnoreCase(o2.getKey());
			}
		});
		list1.forEach(s -> {
			System.out.println(s.getKey() + "->" + s.getValue());
		});

		System.out.println("\n sort according to value: ");
		Set<Entry<String, Integer>> entrySet2 = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(entrySet2);
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue() - o2.getValue();
			}
		});
		list.forEach(s -> {
			System.out.println(s.getKey() + "->" + s.getValue());
		});
	}

	public static void main(String[] args) {
		String str = "Apple Banana Apple Banana Orange Lemon Lemon Lemon";
		sortBasedOnFre(str);
	}

}
