package com.Test.Practice;

import java.util.Scanner;

class XYZ {
	public static boolean chracteris(String str) {
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
				return false;
		}
		return true;

	}
}

public class CheckCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		XYZ x = new XYZ();
		boolean z = x.chracteris(str);
		System.out.println(z);

	}

}
