package com.Sorting_Algorithm;

public class InsertionSortDemo {
	public static void insertionsort(int a[], int n) {
		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int temp = a[i];
			while (j >= 0 && a[j] > temp) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;

		}
	}

	public static void main(String[] args) {
		int a[] = { 3, 40, 34, 5, 12, 44, 30, 7, 11, 0 };
		int n = a.length;
		insertionsort(a, n);
		System.out.println("sorted elements are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
