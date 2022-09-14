package com.Sorting_Algorithm;

public class MergeSortDemo {
	public static void merge(int a[], int l, int h, int mid) {
		int n1 = mid - l + 1;
		int n2 = h - mid;
		int left[] = new int[n1];
		int right[] = new int[n2];
		for (int i = 0; i < n1; i++)
			left[i] = a[i + l];
		for (int j = 0; j < n2; j++)
			right[j] = a[j + mid + 1];
		int i = 0;
		int j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j])
				a[k++] = left[i++];
			else {
				a[k++] = right[j++];
			}

		}
		while (i < n1)
			a[k++] = left[i++];
		while (j < n2)
			a[k++] = right[j++];

	}

	public static void mergesort(int a[], int l, int h) {
		if (l < h) {
			int mid = (l + h) / 2;
			mergesort(a, l, mid);
			mergesort(a, mid + 1, h);
			merge(a, l, h, mid);
		}
	}

	public static void main(String[] args) {
		int a[] = { 3, 40, 34, 5, 12, 44, 30, 7, 1, 0 };
		int n = a.length;
		mergesort(a, 0, n - 1);
		System.out.println("sorted elements are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
