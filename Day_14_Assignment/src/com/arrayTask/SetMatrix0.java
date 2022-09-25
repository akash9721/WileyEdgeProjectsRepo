package com.arrayTask;

import java.util.Scanner;

public class SetMatrix0 {
	public static void makeRowCol0(int mat[][], int n) {
		int rowarr[] = new int[n];
		int colarr[] = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 0) {
					rowarr[i] = 1;
					colarr[j] = 1;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (rowarr[i] == 1 || colarr[j] == 1)
					mat[i][j] = 0;
			}
		}

	}

	public static void display(int a[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row no");
		int n = sc.nextInt();
		System.out.println("enter matrix elements");
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("display matrix elements");
		display(a, n);

		System.out.println("display after performing operation");
		makeRowCol0(a, n);
		display(a, n);
	}
}

//rowarr    0 1 0
//       0 [1,1,1]
//       1 [1,0,1]    input
//       0 [1,1,1]	
//colarr 
//
//ra   0 1 0
//  0 [1,0,1]
//  1 [0,0,0]     output
//  0 [1,0,1]	 