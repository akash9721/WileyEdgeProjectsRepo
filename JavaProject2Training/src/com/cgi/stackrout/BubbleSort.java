package com.cgi.stackrout;

import java.util.Scanner;

public class BubbleSort {
	public static void sortarray(int a[], int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter elements:4");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sortarray(a, n);
		System.out.println("sorted list is");
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

}
