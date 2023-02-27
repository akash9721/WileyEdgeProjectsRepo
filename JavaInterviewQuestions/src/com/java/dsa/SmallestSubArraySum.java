package com.java.dsa;

public class SmallestSubArraySum {

	public static int minSubArrayLen(int target, int[] a) {
		int n = a.length;
		int size = Integer.MAX_VALUE;
		int sum = 0;
		int left = 0;
		for (int right = 0; right < n; right++) {
			sum += a[right];
			while (sum >= target) {
				size = Math.min(size, right - left + 1);
				sum -= a[left];
				left++;
			}
		}
		return size == Integer.MAX_VALUE ? 0 : size;
	}

	public static void main(String[] args) {
		int a[] = { 4, 2, 2, 7, 8, 1, 2, 8, 1, 0 };
		int n = a.length;
		int target = 8;
		System.out.println("smallest subarray with given sum is:= " + minSubArrayLen(target, a));

	}

}
