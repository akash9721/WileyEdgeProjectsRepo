package com.Sorting_Algorithm;

public class BubbleSortDemo {

	public static void bubblesort(int a[], int n) {
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
		int a[] = { 3, 40, 34, 5, 12, 44, 30, 7, 11, 2 };
		int n = a.length;
		bubblesort(a, n);
		System.out.println("sorted elements are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
