package com.recursionTask;

import java.util.Scanner;

public class JoshephusProblem {

	private static int kthSurvivour(int n, int k) {
		if (n == 1)
			return 0;
		return (kthSurvivour(n - 1, k) + k) % n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of people:");
		int n = sc.nextInt();
		System.out.println("Enter the kth value:");
		int k = sc.nextInt();
		int sur = kthSurvivour(n, k);
		System.out.println("Kth position of survivour is: " + sur);

	}

}
