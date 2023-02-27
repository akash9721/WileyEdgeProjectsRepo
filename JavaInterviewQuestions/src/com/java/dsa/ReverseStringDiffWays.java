package com.java.dsa;

public class ReverseStringDiffWays {

	private static void reverse1(String str) {
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s += str.charAt(i);
		}
		System.out.println("reverse string is: " + s);
	}

	private static void reverse2(String s) {
		char str[] = s.toCharArray();
		int i = 0;
		int j = str.length - 1;
		while (i <= j) {
			char temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			i++;
			j--;
		}
		System.out.print("reverse string is: ");
		for (char ch : str) {
			System.out.print(ch);
		}
		System.out.println();
	}

	private static void reverse3(String str) {
		StringBuilder st = new StringBuilder(str);
		System.out.println("reverse string is: " + st.reverse());
	}

	private static void reverse4(String str) {
		StringBuffer st = new StringBuffer(str);
		System.out.println("reverse string is: " + st.reverse());
	}

	public static void main(String[] args) {
		String str = "kashyap";
		reverse1(str);
		reverse2(str);
		reverse3(str);
		reverse4(str);
	}

}
