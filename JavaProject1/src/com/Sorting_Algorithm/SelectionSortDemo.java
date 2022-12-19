package com.Sorting_Algorithm;

public class SelectionSortDemo {

	public static void selectionsort(int a[], int n) {
		int k;
		for (int i = 0; i < n - 1; i++) {
			for (int j = k = i; j < n; j++) {
				if (a[j] < a[k])
					k = j;
			}
			int temp = a[k];
			a[k] = a[i];
			a[i] = temp;
		}
	}

	public static void main(String[] args) {
		int a[] = { 3, 40, 34, 5, 12, 44, 30, 7, 11 };
		int n = a.length;
		selectionsort(a, n);
		System.out.println("sorted elements are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
