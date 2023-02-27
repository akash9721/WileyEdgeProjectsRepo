package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class ArrayQuestion {
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(2, 4, 12, 6, 8, 10);
		// 1. check if all the list element are divisible by 2
		boolean ele = list1.stream().allMatch(x -> x % 2 == 0);
		if (ele) {
			System.out.println("all element are divisible by 2");
		} else {
			System.out.println("all element are not divisible by 2");
		}

		List<Integer> list2 = Arrays.asList(2, 4, 5, 6, 8, 10);
		// 1. check if any element of the list is divisible by 2
		// atleast one element is divisible by 2
		boolean ele2 = list2.stream().anyMatch(x -> x % 2 == 0);
		if (ele2) {
			System.out.println("at least one element is divisible by 2");
		} else {
			System.out.println("No element is divisible by 2");
		}
	}

}
