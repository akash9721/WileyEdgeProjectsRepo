package com.java.classworkday4;

public class Constructor1 {
	String name;
	int roll_no;

	Constructor1() {
		System.out.println("default constructor");
	}

	Constructor1(String name, int roll_no) {
		this.name = name;
		this.roll_no = roll_no;
		System.out.println("Nmae is:" + name + "  Roll no is:" + roll_no);
	}

	public static void main(String[] args) {

		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1("Akash", 1816519);

	}

}
