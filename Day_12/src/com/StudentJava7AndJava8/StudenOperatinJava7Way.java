package com.StudentJava7AndJava8;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudenOperatinJava7Way {

	public static void main(String[] args) {
		List<Student> info = Arrays.asList(new Student("Akash", "Kumar", 5), new Student("Karan", "Singh", 2),
				new Student("Surbhi", "Jain", 10), new Student("Krish", "dev", 6), new Student("avesh", "Khan", 4));
		displayStudents(info);
		System.out.println("----------------------------------------------------------");
		sortStudentByLastName(info);
		System.out.println("----------------------------------------------------------");
		studenLastNameStartwithK(info);

	}

	private static void studenLastNameStartwithK(List<Student> info) {
		System.out.println("Student last name start with K");
		for (Student stu : info) {
			if (stu.getSecondName().startsWith("K"))
				System.out.println(stu);
		}

	}

	private static void displayStudents(List<Student> info) {
		System.out.println("Student Information");
		for (Student stu : info) {
			System.out.println(stu);
		}

	}

	private static void sortStudentByLastName(List<Student> info) {
		System.out.println("Student sort by last name");
		Collections.sort(info, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getSecondName().compareToIgnoreCase(o2.getSecondName());
			}
		});
		for (Student st : info) {
			System.out.println(st);
		}

	}

}
