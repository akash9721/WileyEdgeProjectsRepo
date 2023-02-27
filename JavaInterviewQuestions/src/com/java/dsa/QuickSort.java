package com.java.dsa;

public class QuickSort {
	public static int partition(int a[], int l, int h) {
		int i = l;
		int j = h;
		int pivot = a[l];
		while (i < j) {
			while (a[i] <= pivot)
				i++;
			while (a[j] > pivot)
				j--;
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[j];
		a[j] = a[l];
		a[l] = temp;
		return j;

	}

	public static void quicksort(int a[], int l, int h) {
		if (l <= h) {
			int p = partition(a, l, h);
			quicksort(a, l, p - 1);
			quicksort(a, p + 1, h);
		}
	}

	public static void main(String[] args) {

		int a[] = { 78, 4, 9, 2, 88, 1 };
		int n = a.length;
		quicksort(a, 0, n - 1);
		System.out.println("sorted elements are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
