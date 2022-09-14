package com.cgi.stackrout;

import java.util.Scanner;

public class PalindromeOfNumber {
	static boolean checkpalindrom(int n) {
		int x = n;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		if (x == rev)
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int n = sc.nextInt();
		if (checkpalindrom(n))
			System.out.println("Given no is palindrom");
		else {
			System.out.println("Given no is not palindrom");
		}

	}

}
