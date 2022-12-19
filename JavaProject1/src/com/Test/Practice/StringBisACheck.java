package com.Test.Practice;

import java.util.Scanner;

class XYZK {
	public static boolean check(String a, String b) {
		int n = a.length();
		int m = b.length();
		return (a.substring((n - m), n).equals(b));
	}

}

public class StringBisACheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		XYZK x = new XYZK();
		if (x.check(a, b))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
