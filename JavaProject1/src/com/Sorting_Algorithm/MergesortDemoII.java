package com.Sorting_Algorithm;

import java.util.ArrayList;

public class MergesortDemoII {
	public static void merge(int[] a, int low, int mid, int high) {
		ArrayList<Integer> v = new ArrayList<Integer>();
		int i = 0;
		int j = mid + 1;
		while (i <= mid && j <= high) {
			if (a[i] <= a[j]) {
				v.add(a[i]);
				i++;
			} else {
				v.add(a[j]);
				j++;
			}
		}
		while (i <= mid) {
			v.add(a[i]);
			i++;
		}
		while (j <= high) {
			v.add(a[j]);
			j++;
		}

		for (int k = low; k <= high; k++) {
			a[k] = v.get(k - low);
		}

	}

	public static void mergesort(int a[], int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergesort(a, low, mid);
			mergesort(a, mid + 1, high);
			merge(a, low, mid, high);
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 6, 9, 23, 89, 12 };
		System.out.println("unsorted array are:----");
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
		int n = a.length;
		mergesort(a, 0, n - 1);
		System.out.println("sorted array are:----");
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

}
