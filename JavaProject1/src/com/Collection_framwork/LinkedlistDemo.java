package com.Collection_framwork;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("akash");
		ll.add("vikas");
		ll.add("shyam");
		ll.add(null);
		ll.add("prabh");
		ll.add(null);

		System.out.println(ll);
		Iterator i = ll.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println();
		ll.addFirst("ABHI");
		ll.addLast("SHEKH");

		Iterator ii = ll.iterator();
		while (ii.hasNext()) {
			System.out.print(ii.next() + " ");
		}

		ll.removeFirst();
		ll.removeLast();
		System.out.println();
		Iterator itr = ll.descendingIterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println(ll.peek()); // It retrieves the first element of a list
		System.out.println(ll.poll()); // It retrieves and removes the first element of a list.

		ll.remove("akash");
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);

	}

}
