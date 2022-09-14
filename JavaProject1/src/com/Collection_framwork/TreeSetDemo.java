package com.Collection_framwork;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>(); // inserted element in sorted order and not contain duplicate
														// value
		ts.add(44);
		ts.add(98);
		ts.add(23);
		ts.add(45);
		ts.add(98);
		System.out.println(ts);

	}

}
