package com.java.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	private static List<Integer> findTargetSum(int[] a, int n, int target) {
		// Arrays.sort(a);
		// 2 3 5 6 7 9 9
		List<Integer> ans = new ArrayList<Integer>();
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (a[i] + a[j] == target) {
					ans.add(i + 1);
					ans.add(j + 1);
					flag = true;
					return ans;
				}
			}
		}
		if (flag) {
			return ans;
		} else {
			ans.add(-1);
			return ans;
		}

	}

	private static void twoSumUsingMap(int[] a, int n, int w) {
		// int res[] = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(w - a[i])) {
				System.out.print(map.get(w - a[i]) + 1 + " ");
				System.out.println(i + 1);
				return;
			} else {
				map.put(a[i], i);
			}
		}
		System.out.println("-1");
	}

	public static void main(String[] args) {
		int n = 12;
		int w = 9;
		// i j
		int a[] = { 4, 19, 14, 18, 1, 14, 8, 15, 19, 19, 2, 9 };
		System.out.println(findTargetSum(a, n, w));
		System.out.println("----------------");
		twoSumUsingMap(a, n, w);
	}

}
