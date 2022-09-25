package com.recursionTask;

public class MagicIndex {

	private static int findFirstIndex(int[] a, int n) {
		for (int k = 0; k < n; k++) {
			if (a[k] == k)
				return k;
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 3, 4, 5 };
		int n = a.length;
		int ind = findFirstIndex(a, n);
		System.out.println("First magic index is: " + ind);
	}

}
