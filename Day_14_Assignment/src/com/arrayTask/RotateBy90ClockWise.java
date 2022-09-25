package com.arrayTask;

import java.util.Scanner;

public class RotateBy90ClockWise {

	public static void rotateMatrix(int[][] mat, int n) {
		int temp[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				temp[j][n - i - 1] = mat[i][j];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = temp[i][j];
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
		System.out.println("display before rotate");
		display(a, n);

		System.out.println("display after clockwise rotation");
		rotateMatrix(a, n);
		display(a, n);

	}

}
