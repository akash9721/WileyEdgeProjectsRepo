package com.java.other;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafeDemo {
	public static void main(String[] args) {

		// Fail-lFast iterator
		List<String> set = new ArrayList<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
			// set.set(1, "updated");
		}

		System.out.println();

		// Fail-Safe iterator
		List<String> list = new CopyOnWriteArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
			list.add("four");
			// set.set(1, "updated");
		}

		System.out.println();
		String str = "akash kumar";
		System.out.println("before modifaication:" + str);
		str = str.concat(" kashyap");
		System.out.println("after modifaication:" + str);
	}

}
