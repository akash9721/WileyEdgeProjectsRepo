package com.java.dsa;

public class CheckSetBit {

	private static void checkithsetbit(int n, int i) {
		int mask = (1 << i);
		if ((n & mask) != 0)
			System.out.println("bit is set");
		else {
			System.out.println("bit is not set");
		}
	}

	public static void main(String[] args) {
		// 16 8 4 2 1
		// 1 0 0 1 1
		// 4 3 2 1 0 it
		int n = 19;
		int i = 1;
		checkithsetbit(n, i);
	}

}
