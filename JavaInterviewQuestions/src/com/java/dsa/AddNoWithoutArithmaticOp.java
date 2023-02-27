package com.java.dsa;

public class AddNoWithoutArithmaticOp {

	private static int addTwoNo(int a, int b) {
		while (a > 0) {
			b++;
			a--;
		}
		while (a < 0) {
			b--;
			a++;
		}
		return b;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println("Sum of two no is: " + addTwoNo(a, b));
	}

}
