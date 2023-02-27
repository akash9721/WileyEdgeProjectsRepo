package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeApp {
	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee("Akash", 22, "Male", "IT", 80000),
				new Employee("sanju", 25, "Male", "HR", 50000), new Employee("Mehak", 23, "Female", "IT", 70000),
				new Employee("Monu", 24, "Male", "HR", 75000));

		// 1. find distinct department
		emp.stream().map(Employee::getDept).distinct().forEach(System.out::println);

		System.out.println("\n No of employes working in each department");
		// 2. count no of employes working in each department
		Map<String, Long> collect = emp.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		System.out.println(collect);

		// 3. Average of male and female employee
		System.out.println("\n Average of male and female employee");
		Map<String, Double> collect2 = emp.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(collect2);

		// 4. find all the employee list of HR department
		System.out.println("\n HR department details");
		emp.stream().filter(s -> s.getDept().equals("HR")).forEach(System.out::println);

		// 5. employee details who is taking highest sal in each department
		System.out.println("\n Highest paid employee in each department");
		Map<String, Employee> collect3 = emp.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors
				.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)), Optional::get)));
		System.out.println(collect3);

		// 6. sort employee based on salary desc order
		System.out.println("\n Sort employee based on salary in desc order: ");
		emp.stream().sorted((e1, e2) -> (e2.getSalary() - e1.getSalary())).forEach(System.out::println);

		// 7. nth(3rd) highest salary
		System.out.println("\n 3rd highest salary");

		// select salary from employee order by salary desc limit n-1,1;
		Optional<Integer> findFirst = emp.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).skip(2)
				.findFirst();
		System.out.println(findFirst.get());

		// 8. print max salary from employee
		Optional<Employee> maxsal = emp.stream()
				.collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)));
		System.out.println("\nmax sal of employee is: " + maxsal.get());

		// 9. print min salary from employee
		Optional<Employee> minsal = emp.stream()
				.collect(Collectors.minBy(Comparator.comparingInt(Employee::getSalary)));
		System.out.println("min sal of employee is: " + minsal.get());

		// 10. employee names whose length is >=5
		System.out.println("\nEmployee name length is >=5 ");
		List<String> collect4 = emp.stream().map(e -> e.getName()).filter(e -> e.length() >= 5)
				.collect(Collectors.toList());
		System.out.println(collect4);
	}

}
