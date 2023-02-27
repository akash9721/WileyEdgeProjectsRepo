package com.java.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

	private static void union(int[] a1, int[] a2) {
		Set<Integer> set1 = new HashSet<Integer>();
		for (int i = 0; i < a1.length; i++) {
			set1.add(a1[i]);
		}
		for (int j = 0; j < a2.length; j++) {
			set1.add(a2[j]);
		}
		System.out.println(set1);
	}

	private static void intersection(int[] a1, int[] a2) {
		Set<Integer> s1 = new HashSet<Integer>();
		for (int i = 0; i < a1.length; i++) {
			s1.add(a1[i]);
		}

		for (int i = 0; i < a2.length; i++) {
			if (s1.contains(a2[i])) {
				System.out.print(a2[i] + " ");
				s1.remove(a2[i]);
			}

		}
	}

	private static void intersectionUsingJava8(int[] a1, int[] a2) {
		Arrays.stream(a1).filter(x -> Arrays.stream(a2).anyMatch(y -> y == x)).distinct()
				.forEach(e -> System.out.print(e + " "));
	}

	public static void main(String[] args) {
		int a1[] = { 4, 9, 5 };
		int a2[] = { 9, 4, 9, 8, 4 };
		intersection(a1, a2);
		System.out.println();
		union(a1, a2);
		System.out.println("intersection of two array using java 8");
		intersectionUsingJava8(a1, a2);
	}

}
