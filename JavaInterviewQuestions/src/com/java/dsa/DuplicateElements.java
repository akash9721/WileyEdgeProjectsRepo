package com.java.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class DuplicateElements {

	private static void duplicate(int[] a) {
		int len = a.length;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < len; i++) {
			if (set.contains(a[i]))
				System.out.print(a[i] + " ");
			else {
				set.add(a[i]);
			}
		}
	}

	private static void usingStream(int[] a) {
		IntStream st = Arrays.stream(a);
		Set<Integer> s = new HashSet<Integer>();
		st.filter(x -> !s.add(x)).forEach(e -> System.out.print(e + " "));
	}

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 2, 2, 1 };
		duplicate(a);
		System.out.println();
		usingStream(a);
	}

}
