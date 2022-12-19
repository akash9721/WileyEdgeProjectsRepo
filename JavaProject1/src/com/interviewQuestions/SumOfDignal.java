package com.interviewQuestions;

public class SumOfDignal {

	private static void dignalSum(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i == j || (i + j) == a.length - 1) {
					sum += a[i][j];
				}
			}
		}
		System.out.println("sum of dignal is: " + sum);
	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		dignalSum(a);
	}

}
