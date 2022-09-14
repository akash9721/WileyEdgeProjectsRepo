package com.cgi.stackrout;

import java.util.Scanner;

public class SumOfArrayInQubeAndSquareForm {

	public static int sumis(int[] a) {
		int evensum = 0, oddsum = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] % 2 == 0)
				evensum += (a[i] * a[i]);
			else
				oddsum += (a[i] * a[i] * a[i]);
		return evensum + oddsum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter array elements:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Sum of qube and square is:");
		System.out.println(sumis(a));

	}
}
