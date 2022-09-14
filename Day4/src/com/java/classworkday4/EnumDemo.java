package com.java.classworkday4;

public class EnumDemo {
	public static void main(String[] args) {
		Months m = Months.JANRUERY;
		m.selectmonth();
		System.out.println(m);
		System.out.println("No of day in " + m + " is " + m.noofday());
	}

}
