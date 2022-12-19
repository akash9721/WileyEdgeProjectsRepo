package com.interviewQuestions;

public class Demo1 extends AbstractConstructor {
	int x;
	int y;

	public Demo1(int a, int b, int x, int y) {
		super(a, b);
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1(2, 3, 4, 5);
		System.out.println(d.a + " " + d.b + " " + d.x + " " + d.y);
	}

}
