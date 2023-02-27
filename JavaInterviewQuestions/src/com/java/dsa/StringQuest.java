package com.java.dsa;

import java.util.HashMap;
import java.util.Map;

public class StringQuest {

	private static void countFreque(String str, int n) {
		char strarr[] = str.toCharArray();
		int cnt = 1;
		String out = "";
		for (int i = 0; i < strarr.length - 1; i++) {
			if (strarr[i] == strarr[i + 1]) {
				cnt++;
			} else {
				out += strarr[i] + Integer.toString(cnt);
				cnt = 1;
			}
		}
		System.out.println(out);
	}

	private static void usingMaping(String str, int n) {
		char arr[] = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Map.Entry me : map.entrySet()) {
			System.out.print(me.getKey() + "" + me.getValue());
		}
	}

	public static void main(String[] args) {
		String str = "aaabbccccd";
		int n = str.length();
		countFreque(str, n);
		System.out.println();
		usingMaping(str, n);
	}

}
