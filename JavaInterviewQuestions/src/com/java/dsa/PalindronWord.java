package com.java.dsa;

public class PalindronWord {

	private static boolean isPalin(String st) {
		char a[] = st.toCharArray();
		int i = 0;
		int j = a.length - 1;
		while (i <= j) {
			if (a[i] != a[j])
				return false;
			i++;
			j--;
		}
		return true;
	}

	private static void palindronWord(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (isPalin(arr[i]))
				System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		String str = "My name is nitin and i from malayalam";
		String arr[] = str.split(" ");
		palindronWord(arr);
	}

}
