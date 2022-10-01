package com.StudentJava7AndJava8;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
	public static void main(String[] args) {
		List<Student> info = Arrays.asList(new Student("Akash", "Kumar", 5), new Student("Karan", "Singh", 2),
				new Student("Surbhi", "Jain", 10), new Student("Krish", "dev", 6), new Student("Avesh", "Khan", 4));

		System.out.println("Display the Student data");
		info.stream().forEach(s -> System.out.println(s));// terminal function
		System.out.println("-----------------------------");

		System.out.println("Display student name start with K");
		info.stream().filter((p) -> p.getFirstName().startsWith("K")).forEach(s -> System.out.println(s));// intermediate+terminal
																											// function
		System.out.println("------------------------------");

		System.out.println("Display data which Empid is greater than 5");
		info.stream().filter((d) -> d.getStudentID() > 5).forEach(s -> System.out.println(s));// intermediate+terminal
																								// function
		System.out.println("------------------------------");

		System.out.println("Sort Student first name in descending order:");
		info.stream().sorted((s1, s2) -> s2.getFirstName().compareTo(s1.getFirstName())) // intermediate+terminal
																							// function
				.forEach(s -> System.out.println(s));
		System.out.println("------------------------------");

		System.out.println("No of person whose id is greater than 5");
		long val = info.stream().filter((s) -> s.getStudentID() > 5).count();
		System.out.println(val);
		System.out.println("------------------------------");

		System.out.println("Print First and last name in uppercase");
		info.stream().map((f) -> f.getFirstName().toUpperCase()).forEach(s -> System.out.println(s));
		System.out.println("------------------------------");

		System.out.println("use of reduce terminal func");
		System.out.println((info.stream().map((m) -> m.getStudentID()).reduce(0, (sum, id) -> sum + id)));
		// or
		System.out.println(info.stream().mapToInt(s -> s.getStudentID()).sum());

	}

}
