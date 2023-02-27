package com.java.dsa;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	private static void commonEle(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (set.contains(arr2[i]))
				System.out.print(arr2[i] + " ");
		}
	}

	private static boolean checkBothArraySame(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length)
			return false;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (!set.contains(arr2[i]))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
//		int arr1[] = { 80, 10, 15, 2, 35, 60 };
//		int arr2[] = { 35, 80, 60, 20, 75 };
		int arr1[] = { 3, 2, 5, 7 };
		int arr2[] = { 2, 3, 5, 7 };
		commonEle(arr1, arr2);
		System.out.println();
		if (checkBothArraySame(arr1, arr2))
			System.out.println("Both are same");
		else {
			System.out.println("not same");
		}
	}

}
