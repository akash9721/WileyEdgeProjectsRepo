package com.StudentJava7AndJava8;

import java.util.Arrays;
import java.util.List;

public class StudentProcessJava7Way2 {
	public static void main(String[] args) {
		List<Student> info = Arrays.asList(new Student("Akash", "Kumar", 5), new Student("Karan", "Singh", 2),
				new Student("Surbhi", "Jain", 10), new Student("Krish", "dev", 6), new Student("avesh", "Khan", 4));
		System.out.println("Student first name strt with K");
		printConditionally(info, new Condition() {
			@Override
			public boolean test(Student s) {
				return s.getFirstName().startsWith("K");
			}
		});
		System.out.println("=================================================");
		System.out.println("Student last name start with k");
		printConditionally(info, new Condition() {
			@Override
			public boolean test(Student s) {
				return s.getSecondName().startsWith("K");
			}
		});

	}

	public static void printConditionally(List<Student> info, Condition c) {
		for (Student st : info) {
			if (c.test(st))
				System.out.println(st);
		}
	}

}
