package com.java.other;

public class Student implements Comparable<Student> {
	private String studenName;
	private String lastName;
	private int studentId;
	private String collegeName;

//	@Override
//	public int compareTo(Student o) {
//		return this.studentId - o.studentId;
//	}
	public Student(String studenName, String lastName, int studentId, String collegeName) {
		super();
		this.studenName = studenName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.collegeName = collegeName;
	}

	public String getStudenName() {
		return studenName;
	}

	public void setStudenName(String studenName) {
		this.studenName = studenName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [studenName=" + studenName + ", lastName=" + lastName + ", studentId=" + studentId
				+ ", collegeName=" + collegeName + "]" + "\n";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.studenName.compareTo(o.studenName);
	}

}
