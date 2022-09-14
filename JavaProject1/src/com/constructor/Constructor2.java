package com.constructor;

public class Constructor2 {

	String name;
	int rollno;

	public Constructor2(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public Constructor2() {

	}

	void display() {
		System.out.println("Name of the studen is:=" + name + "   Roll no is:=" + rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor2 c2 = new Constructor2("Akash", 1816519);
		Constructor2 c3 = new Constructor2();

		// we can copy the value of one object into another
		c3.name = c2.name;
		c3.rollno = c2.rollno;
		c2.display();
		c3.display();

	}

}
