package com.Collection_framwork;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeuDemo {
	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(100);
		ad.add(20);
		ad.add(1);
		ad.add(16);

		Iterator it = ad.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		ad.addFirst(500);
		ad.addLast(1000);

		System.out.println(ad);

		System.out.println(ad.peek()); // is used to reterive the first value but not remove
		System.out.println(ad);
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		System.out.println();

		System.out.println(ad.poll()); // is used to reterive the first value and remove the value
		System.out.println(ad);

	}

}
