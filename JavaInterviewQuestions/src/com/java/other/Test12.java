package com.java.other;

public class Test12 {

	private static void cntLength(int[] a, int n) {
		int max = Integer.MIN_VALUE;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				cnt++;
				max = a[i];
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		int a[] = { 1, 1, 3, 4, 2 };
		int n = a.length;
		cntLength(a, n);
	}

	// [1,2,3,4,5]
	// [1,6,3,4,8]

	/*
	 * 1>0 1 2>1 2 3>2 3 4>3 4 5>4 5
	 * 
	 * 1>0 1 6>1 2 3>6 2 4>6 2 8>6 3
	 * 
	 */

}
