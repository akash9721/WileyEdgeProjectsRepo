package com.interviewQuestions;

// You are using Java
import java.util.Scanner;

class Student1 {
	private String name;
	private int registerNo;

	Student1(String name, int registerNo) {
		this.name = name;
		this.registerNo = registerNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRegisterNo(int registerNo) {
		this.registerNo = registerNo;
	}

	public int getRegisterNo() {
		return registerNo;
	}

	// Course c=new Course();
	// String sub=c.getCourseName();
	public void display(Course obj) {
		System.out.println(this.name + " is learning the " + obj.getCourseName() + " course");
	}
}

class Course {
	private int id;
	private String courseName;

	Course(int id, String courseName) {
		this.id = id;
		this.courseName = courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}

class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int registerno = sc.nextInt();
		int id = sc.nextInt();
		String courseName = sc.next();
		Course cc = new Course(id, courseName);
		// cc.setId(id);
		// cc.setCourseName(courseName);
		Student1 s = new Student1(name, registerno);
		// s.setRegisterNo(registerno);
		// s.setName(name);
		s.display(cc);
	}
}