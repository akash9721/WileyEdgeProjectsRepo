package com.cgi.stackrout;

import java.util.Scanner;

public class PlaindronOfString {

	static void checkpalindrom(String str) {
		String revstr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revstr += str.charAt(i);
		}
		if (revstr.equals(str))
			System.out.println("String is palindrom");
		else {
			System.out.println("String is not palindrom");
		}
	}

	static void checkpalindrom1(String s) {
		StringBuilder sb = new StringBuilder(s);
		String revstr = sb.reverse().toString();
		if (s.equals(revstr))
			System.out.println("String is palindrom");
		else {
			System.out.println("String is not palindrom");
		}
	}

	static boolean checkpalindrom3(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		// checkpalindrom(str);
		// checkpalindrom1(str);
		if (checkpalindrom3(str))
			System.out.println("String is palindrom");
		else {
			System.out.println("String is not palindrom");
		}
	}

}
