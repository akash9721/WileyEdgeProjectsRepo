package com.Test.Practice;

import java.util.Scanner;

public class CountUpperAndLowerCharacter {
	public static void findupperandlower(String str) {
		int n = str.length();
		int upper = 0;
		int lower = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				upper++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				lower++;
			}
		}
		System.out.println("Upper character is: " + upper);
		System.out.println("Lower character is: " + lower);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		findupperandlower(str);
	}

}
