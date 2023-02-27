package com.java.dsa;

public class SwapNoUsingDiffWays {

	// 1. using third variable
	private static void method1(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}

	// 2. using + & - op without using 3rd variable
	private static void method2(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
	}

	// 3. using * & / op without using 3rd variable
	private static void method3(int a, int b) {
		// 10 20
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println(a + " " + b);
	}

	// 4. using ^ op without using 3rd variable
	private static void method4(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + " " + b);
	}

	// 5. using single statement
	private static void method5(int a, int b) {
		b = a + b - (a = b);
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		method1(a, b);
		method2(a, b);
		method3(a, b);
		method4(a, b);
		method5(a, b);
	}
}
