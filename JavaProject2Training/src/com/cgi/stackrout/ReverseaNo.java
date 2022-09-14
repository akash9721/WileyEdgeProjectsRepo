package com.cgi.stackrout;

import java.util.Scanner;

public class ReverseaNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No:");
		int n = sc.nextInt();
		int res = 0;
		while (n > 0) {
			int rem = n % 10;
			res = res * 10 + rem;
			n /= 10;
		}
		System.out.println("The reverse no is:");
		System.out.println(res);

		// Reverse a array
		System.out.println();
		System.out.println("Enter Array values:");
		int a[] = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Reverse array is:");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}

}
