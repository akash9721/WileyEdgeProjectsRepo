package com.java.assignment;

public class FibonacciUpToN {

	public void findfibonno(int n) {
		int first = 0;
		int second = 1;

		int third = 0;
		while (third <= n) {
			System.out.print(third + " ");
			first = second;
			second = third;
			third = first + second;
		}

	}

	public static void main(String[] args) {
		int n = 10;
		FibonacciUpToN f = new FibonacciUpToN();
		f.findfibonno(n);
	}

}
