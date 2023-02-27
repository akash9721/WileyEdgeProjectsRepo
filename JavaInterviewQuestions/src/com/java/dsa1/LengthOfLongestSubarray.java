package com.java.dsa1;

import java.util.Scanner;

public class LengthOfLongestSubarray {

	public static int LengthOfLongestSubarray(int a[], int n) {
		int cnt = 1;
		int maxCnt = 1;
		int i = 0, j = 1;
		while (j < n) {
			if (a[j] > a[j - 1]) {
				cnt++;
				j++;
				maxCnt = Math.max(maxCnt, cnt);
			} else {
				cnt = 1;
				i = j;
				j++;
			}
		}
		return maxCnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("length is: " + LengthOfLongestSubarray(a, n));
	}
}

//testcase 1
//9
//5 6 3 5 7 8 9 1 2
//length is: 5

//testcase 2
//10
//12 13 1 5 4 7 8 10 10 1
//length is: 4
