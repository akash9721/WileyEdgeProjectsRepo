package com.Collection_framwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Listdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add(10);
		l.add(89);
		l.add(34);
		l.add(22);
		l.add(11);

		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); // it print the element one by one

		}
		System.out.println();
		ListIterator lt = l.listIterator();
		while (lt.hasNext()) {
			System.out.println(lt.next());

		}
		System.out.println();

		while (lt.hasPrevious()) {
			System.out.println(lt.previous());

		}

	}

}
