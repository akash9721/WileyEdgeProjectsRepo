package com.Collection_framwork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<Integer>(); // in this case element is printed in random hash(order)
		hs.add(100);
		hs.add(12);
		hs.add(175);
		hs.add(53);
		hs.add(null);
		hs.add(100);
		System.out.println(hs);

		hs.remove(100);
		System.out.println(hs);

		System.out.println(hs.contains(100));

		System.out.println(hs.isEmpty());

		System.out.println(hs.size());
		System.out.println();

		Set<Integer> lhs = new LinkedHashSet<Integer>(); // in case of Linkedhashset order is maintain in which order
															// element is inserted element is printed in same order
		lhs.add(100);
		lhs.add(12);
		lhs.add(175);
		lhs.add(53);
		lhs.add(null);
		lhs.add(100);
		System.out.println(lhs);

		lhs.remove(100);
		System.out.println(lhs);

		System.out.println(lhs.contains(100));

		System.out.println(lhs.isEmpty());

		System.out.println(lhs.size());

	}

}
