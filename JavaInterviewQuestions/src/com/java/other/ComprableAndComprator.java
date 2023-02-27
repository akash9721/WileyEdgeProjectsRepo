package com.java.other;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComprableAndComprator {
	public static void main(String[] args) {
		List<Student> st = Arrays.asList(new Student("vikram", "kumar", 123, "CGCTC"),
				new Student("akil", "yadav", 980, "MNIT"), new Student("akansha", "shrma", 432, "LKT"),
				new Student("poojita", "kumar", 562, "HYDB"));
		System.out.println(st);
		Collections.sort(st);
		System.out.println();
		System.out.println(st);

//		Collections.sort(st, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o1.getStudentId() - o2.getStudentId();
//			}
//		});
//		System.out.println(st);
//
//		Collections.sort(st, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o1.getLastName().compareToIgnoreCase(o2.getLastName());
//				if (res != 0)
//					return res;
//				return o1.getStudenName().compareToIgnoreCase(o2.getStudenName());
//			}
//
//		});
//		System.out.println(st);

	}

}
