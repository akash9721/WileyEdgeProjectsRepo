package com.java.classworkday4;

class Employee {
	private int empid;
	private String name;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Company {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("John");
		e.setEmpid(111);
		System.out.println("employee name is: " + e.getName());
		System.out.println("employee id is: " + e.getEmpid());
	}

}
