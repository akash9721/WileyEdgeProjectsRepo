package com.spring.referenceType;

public class Student {
	private String name;
	private String rollNo;
	Address studentAddress;

	public Student() {

	}

	public Student(String name, String rollNo, Address studentAddress) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.studentAddress = studentAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", studentAddress=" + studentAddress + "]";
	}

}
