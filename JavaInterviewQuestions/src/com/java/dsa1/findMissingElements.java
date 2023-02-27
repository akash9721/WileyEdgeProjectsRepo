package com.java.dsa1;

public class findMissingElements {
	public static void main(String[] args) {
		int a[] = { 2, 3, 6, 7, 10 };
		find1(a);
		System.out.println();
		find(a);
	}

	private static void find1(int[] a) {
		int diff = a[0] - 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] - i != diff) {
				while (diff < a[i] - i) {
					System.out.print(diff + i + " ");
					diff++;
				}
			}
		}
	}

	private static void find(int[] a) {
		int cnt = 0;
		for (int i = a[0]; i <= a[a.length - 1]; i++) {
			if (a[cnt] == i) {
				cnt++;
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
