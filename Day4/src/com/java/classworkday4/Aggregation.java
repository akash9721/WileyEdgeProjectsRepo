package com.java.classworkday4;

/////Assosiation example

class Student {
	String name;
	String collagename;
	int rollno;

	public Student(String name, String collagename, int rollno) {
		this.name = name;
		this.collagename = collagename;
		this.rollno = rollno;
	}

}

class Employe extends Student {
	String empname;

	public Employe(String name, String sname, String scollname, int rollno) {
		super(sname, scollname, rollno);
		this.empname = name;
		// TODO Auto-generated constructor stub
	}

}

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e = new Employe("Ramu", "akash", "CGCTC", 1816519);
		System.out.println(e.empname + " workd in " + e.name + " school name is " + e.collagename);

	}

}
