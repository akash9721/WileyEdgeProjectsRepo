package com.Collection_framwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequencyOfChracter {
	public static void cntchar(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char ch[] = str.toCharArray();
		for (char x : ch) {
			if (map.containsKey(x)) {
				map.put(x, map.get(x) + 1);
			} else {
				map.put(x, 1);
			}

		}
		char x = ' ';
		for (Map.Entry<Character, Integer> me : map.entrySet()) {
			// System.out.println(me.getKey() + " :" + me.getValue());
			if (me.getValue() > 1) {
				x = me.getKey();
			}
		}
		System.out.println(x);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		cntchar(str);
	}

}
