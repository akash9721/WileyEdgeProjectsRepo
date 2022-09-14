package com.Collection_framwork;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapsDemo {
	public static void main(String[] args) {
		Map<String, Integer> mp = new TreeMap<>(); // Treehmap store key valur pair in sorted order based on
													// values(alphabetical order) where all keys are unique //values
		// may unique or not
		mp.put("akash", 1);
		mp.put("pari", 6); // treemap does not contain null values
		mp.put("yash", 9);
		mp.put("prabh", 7);
		System.out.println(mp);

// if we try to add same keys then it not allowed keys are override with new
// values
		mp.put("akash", 10);
		System.out.println(mp);

// if i want not to do such then i have to make check

		if (!mp.containsKey("yash")) { // in this case value will not override
			mp.put("yash", 123);
		}
		System.out.println(mp);
		System.out.println();

		for (Map.Entry<String, Integer> e : mp.entrySet()) { // for printing both key and value apir
			System.out.print(e + " ");
		}
		System.out.println();

		for (Map.Entry<String, Integer> e : mp.entrySet()) { // for printing only keys
			System.out.print(e.getKey() + " ");
		}
		System.out.println();

		for (Map.Entry<String, Integer> e : mp.entrySet()) { // for only printing values
			System.out.print(e.getValue() + " ");
		}
		System.out.println();

		for (String keys : mp.keySet()) { // another way for only printing keys
			System.out.print(keys + " ");
		}
		System.out.println();

		for (Integer values : mp.values()) { // another way for only printing values
			System.out.print(values + " ");
		}
	}

}
