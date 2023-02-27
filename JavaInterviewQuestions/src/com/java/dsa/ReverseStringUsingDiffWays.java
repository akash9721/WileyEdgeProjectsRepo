package com.java.dsa;

public class ReverseStringUsingDiffWays {
	public static void main(String[] args) {
		String str = "akash";
		revString1(str);
		revString2(str);
		revString3(str);
		revString4(str);
	}

	private static void revString4(String str) {
		char[] arr = str.toCharArray();
		int i = 0;
		int j = str.length() - 1;
		while (i <= j) {
			swap(arr, i, j);
			i++;
			j--;
		}
		System.out.println(arr);
	}

	private static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void revString3(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

	private static void revString1(String str) {
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		System.out.println(res);
	}

	private static void revString2(String str) {
		char[] arr = str.toCharArray();
		String res = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			res += arr[i];
		}
		System.out.println(res);
	}
}
