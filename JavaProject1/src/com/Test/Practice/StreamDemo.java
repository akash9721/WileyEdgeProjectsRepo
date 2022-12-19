package com.Test.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("ramu", 8000, "HCL"),
				new Employee("shyamu", 30000, "TCS"), new Employee("akash", 80000, "Amazone"),
				new Employee("monu", 5000, "Capazimny"));

		System.out.println("--------------------------------------------------------------");
		System.out.println("Sort employee details based on first name");
		employees.stream().sorted((n1, n2) -> n1.getEmpName().compareTo(n2.getEmpName()))
				.forEach(x -> System.out.println(x));

		System.out.println("--------------------------------------------------------------");
		System.out.println("Sort employee details based on salary");
		employees.stream().sorted((e1, e2) -> (int) (e1.getEmpSal() - e2.getEmpSal())).forEach(System.out::println);

		System.out.println("--------------------------------------------------------------");
		System.out.println("listout the employee whose salary is more than 10000");
		employees.stream().filter(e -> e.getEmpSal() > 10000).forEach(System.out::println);

		System.out.println("--------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------");
		Integer arr[] = { 10, 20, 30, 2, 5, 33, 12, 44 };
		System.out.println("get second max no: ");
		Integer val = Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(val);

	}

}
