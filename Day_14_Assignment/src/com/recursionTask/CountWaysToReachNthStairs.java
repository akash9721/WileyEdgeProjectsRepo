package com.recursionTask;

import java.util.Scanner;

public class CountWaysToReachNthStairs {

	private static int cntStairs(int n) {
		if (n == 1 || n == 0)
			return 1;
		else if (n == 2)
			return 2;
		else
			return cntStairs(n - 1) + cntStairs(n - 2) + cntStairs(n - 3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of stairs:");
		int n = sc.nextInt();
		int val = cntStairs(n);
		System.out.println("Now of ways to reach the last stair is: " + val);
	}

}
