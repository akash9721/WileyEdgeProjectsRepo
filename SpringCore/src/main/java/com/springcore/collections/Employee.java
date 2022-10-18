package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String empName;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> course;

	public Employee(String empName, List<String> phones, Set<String> address, Map<String, String> course) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.address = address;
		this.course = course;
	}

	public Employee() {

	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", phones=" + phones + ", address=" + address + ", course=" + course
				+ "]";
	}

}
