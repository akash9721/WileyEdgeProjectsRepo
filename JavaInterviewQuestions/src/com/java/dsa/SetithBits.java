package com.java.dsa;

public class SetithBits {

	private static void checkithsetbit(int n, int i) {
		int mask = (1 << i);
		int newsetbit = (n | mask);
		System.out.println("updated set bit: " + newsetbit);
	}

	private static void clearithsetbit(int n, int i) {
		int mask = ~(n << i);
		int newbit = (n & mask);
		System.out.println("updated unset bit: " + newbit);
	}

	public static void main(String[] args) {
		// 16 8 4 2 1
		// 1 0 0 1 1 19
		// 4 3 2 1 0 it
		int n = 19;
		int i = 2;
		checkithsetbit(n, i);
		clearithsetbit(n, 1);
	}

}
// 1 0 1 1 1
