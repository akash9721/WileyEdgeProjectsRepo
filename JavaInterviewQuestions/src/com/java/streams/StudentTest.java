package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> stu = Arrays.asList(new Student("arun", 5, 90, 22), new Student("deepak", 7, 80, 15),
				new Student("hari", 1, 75, 19), new Student("sanjay", 2, 95, 22), new Student("bani", 9, 99, 21),
				new Student("insia", 9, 80, 21));

		stu.stream().sorted((s1, s2) -> (int) (s1.getMarks() - s2.getMarks())).forEach(s -> System.out.println(s));

		System.out.println("\nStudent name who secure highest marks:");
		Student student = stu.stream().sorted((s1, s2) -> (int) (s2.getMarks() - s1.getMarks())).findFirst().get();
		System.out.println(student.getName());

//		if (System.out.append("hello world") == null) {
//
//		}
//		if (System.out.printf("\nhello world") == null) {
//
//		}
//		for (int i = 0; i++ < 1; System.out.println("\nHello world")) {
//
//		}
		System.out.println("--------------------------------------");
		System.out.println("group data based on age");
		Map<Integer, List<Student>> collect = stu.stream()
				.collect(Collectors.groupingBy(Student::getAge, Collectors.toList()));
		System.out.println(collect);

		System.out.println();
		System.out.println("\n Sort Student data based on student names ");
		stu.stream().sorted((s1, s2) -> (s1.getName().compareToIgnoreCase(s2.getName()))).forEach(System.out::println);

	}

}
