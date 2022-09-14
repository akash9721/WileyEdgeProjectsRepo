package com.cgi.stackrout;

import java.util.Scanner;

public class MaximumAndMinOccuCharacter {
	public static void findmaxandminchar(String str) {
		int arr[] = new int[127];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		char minchar = ' ';
		char maxchar = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] > max) {
				max = arr[str.charAt(i)];
				maxchar = str.charAt(i);
			}
			if (arr[str.charAt(i)] < min) {
				min = arr[str.charAt(i)];
				minchar = str.charAt(i);
			}
		}
		System.out.println("Minimum no of character:" + minchar);
		System.out.println("Maximum no of character:" + maxchar);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		String st = str.replaceAll("\\s", "");
		System.out.println(st);
		findmaxandminchar(st);
	}

}
