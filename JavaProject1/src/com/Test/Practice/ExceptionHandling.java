package com.Test.Practice;

import java.util.Scanner;

class ExceptionHandling {
	public static void main(String[] args) {
		int amt = 25000;
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		try {
			if (val > amt)
				throw new Exception();
			else
				System.out.println(val);

		} catch (Exception e) {
			System.out.println("Caught MinimumAccountBalance: Minimum Account Balance Exception");
		}
	}
}
