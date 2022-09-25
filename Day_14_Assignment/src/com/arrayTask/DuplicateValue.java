package com.arrayTask;

import java.util.Arrays;

public class DuplicateValue {

	public static boolean duplicate1(int a[], int n) {
		Arrays.sort(a);
		for (int i = 1; i < n; i++) {
			if (a[i] == a[i - 1])
				return true;
		}
		return false;
	}

	public static boolean duplicate2(int a[], int n) {
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j])
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 3, 6, 1, 5 };
		int n = a.length;
		System.out.println(duplicate1(a, n));
		System.out.println(duplicate2(a, n));
	}

}
