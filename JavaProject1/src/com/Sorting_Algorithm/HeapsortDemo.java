package com.Sorting_Algorithm;

public class HeapsortDemo {
	public static void heapify(int a[], int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left < n && a[left] > a[largest])
			largest = left;
		if (right < n && a[right] > a[largest])
			largest = right;
		if (i != largest) {
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			heapify(a, n, largest);
		}
	}

	public static void heapsort(int a[], int n) {
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(a, n, i); // for making max tree
		}
		for (int i = n - 1; i >= 0; i--) { // for deleting the element
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heapify(a, i, 0);
		}
	}

	public static void main(String[] args) {
		int a[] = { 3, 40, 34, 5, 12, 44, 30, 7, 1 };
		int n = a.length;
		heapsort(a, n);
		System.out.println("sorted elements are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
