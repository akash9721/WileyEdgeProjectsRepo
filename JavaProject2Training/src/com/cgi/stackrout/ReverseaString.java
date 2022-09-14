package com.cgi.stackrout;

import java.util.Scanner;

public class ReverseaString {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = cs.nextLine();
		char ch[] = str.toCharArray();

		String revstr = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			revstr += ch[i];
		}
		System.out.println(revstr);
	}

}
