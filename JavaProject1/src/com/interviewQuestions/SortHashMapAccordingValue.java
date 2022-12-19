package com.interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapAccordingValue {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "shivani");
		map.put(9, "akash");
		map.put(8, "prabh");
		map.put(4, "kk");
		map.put(1, "kamal");

		map.forEach((k, v) -> System.out.println(k + "-> " + v));

		System.out.println("sort hashmap based on value-----------------");

		// map has a method entryset and return type of entryset is set of entry (is key
		// value pair)
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		// create list of entry object here you can give any implmentation of
		// list(arraylist,linkedlist)
		List<Entry<Integer, String>> list = new ArrayList<>(entrySet);
		Collections.sort(list, new Comparator<Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		list.forEach(s -> {
			System.out.println(s.getKey() + "-> " + s.getValue());
		});
	}

}
