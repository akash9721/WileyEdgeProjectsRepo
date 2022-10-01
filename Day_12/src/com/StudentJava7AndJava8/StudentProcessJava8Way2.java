package com.StudentJava7AndJava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StudentProcessJava8Way2 {
	public static void main(String[] args) {
		List<Student> info = Arrays.asList(new Student("Akash", "Kumar", 5), new Student("Karan", "Singh", 2),
				new Student("Surbhi", "Jain", 10), new Student("Krish", "dev", 6), new Student("avesh", "Khan", 4));

		System.out.println("First names start with k");
		printConditionally(info, (s) -> s.getFirstName().startsWith("K"), s -> System.out.println(s));
		System.out.println("-------------------------------------------");

		System.out.println("Last names start with k");
		printConditionally(info, (s) -> s.getSecondName().startsWith("K"), s -> System.out.println(s));
	}

	public static void printConditionally(List<Student> info, Condition c, Consumer<Student> consumer) {
		for (Student st : info) {
			if (c.test(st))
				consumer.accept(st);
		}
	}

}