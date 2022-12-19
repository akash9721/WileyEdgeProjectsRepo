package com.Sorting_Algorithm;

public class MergeSortDemo {

	public static void merge(int a[], int l, int h, int mid) {

		// Creating left and right right array of size n1 and n2
		int n1 = mid - l + 1;
		int n2 = h - mid;
		int left[] = new int[n1];
		int right[] = new int[n2];
		for (int i = 0; i < n1; i++)
			left[i] = a[i + l];
		for (int j = 0; j < n2; j++)
			right[j] = a[j + mid + 1];

		// Maintain current index of sub-arrays and main array
		int i = 0;
		int j = 0; // left right
		int k = l; // 1 4 6 4 2 7 3 44
		while (i < n1 && j < n2) { // i j
			if (left[i] <= right[j])
				a[k++] = left[i++];
			else {
				a[k++] = right[j++];
			}

		}

		// pick up the remaining elements from left or right array and put into main
		// array
		while (i < n1)
			a[k++] = left[i++];
		while (j < n2)
			a[k++] = right[j++];

	}

	public static void mergesort(int a[], int l, int h) {
		if (l < h) {
			// divide array into two parts
			int mid = (l + h) / 2;
			mergesort(a, l, mid);
			mergesort(a, mid + 1, h);
			// merge function will merge the two arrays.
			merge(a, l, h, mid);
		}
	}

	// display the array elements
	public static void display(int a[], int n) {
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {
		int a[] = { 3, 40, 34, 5, 12, 44, 30, 7, 1, 0 };
		int n = a.length;
		System.out.println("Elements before sorting: ");
		display(a, n);
		mergesort(a, 0, n - 1);

		System.out.println();
		System.out.println("Elements after sorting: ");
		display(a, n);
	}

}
