package com.StudentJava7AndJava8;

public class Student {
	private String firstName;
	private String secondName;
	private int studentID;

	public Student(String firstName, String secondName, int studentID) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.studentID = studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", secondName=" + secondName + ", studentID=" + studentID + "]";
	}

}
