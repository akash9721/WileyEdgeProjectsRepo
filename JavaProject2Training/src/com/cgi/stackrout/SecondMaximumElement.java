package com.cgi.stackrout;

public class SecondMaximumElement {

	public static void secondmaximum(int a[], int n) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[i] > first) {
				second = first;
				first = a[i];
			} else if (a[i] > second) {
				second = a[i];
			}
		}

		System.out.println("firstmaximum: " + first);
		System.out.println("secondmaximum: " + second);
	}

	public static void main(String[] args) {
		int a[] = { 1, 5, 50, 3, 70 };
		int n = a.length;
		secondmaximum(a, n);
	}

}
