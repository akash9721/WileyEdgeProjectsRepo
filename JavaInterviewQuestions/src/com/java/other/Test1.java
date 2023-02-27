package com.java.other;

public class Test1 {
	String msg;
	int n;

	public Test1() {
		msg += " Thank you";
	}

	public Test1(int n) {
		this.n = n;
		msg += "Welcome";
	}

	public static void main(String[] args) {
		Test1 obj = new Test1(5);
		System.out.println(obj.msg);
	}
}
