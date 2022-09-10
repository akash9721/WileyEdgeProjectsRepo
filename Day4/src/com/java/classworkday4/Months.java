package com.java.classworkday4;

public enum Months {
	JANRUERY(31), FEBRUERY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30),
	OCTOBER(31), NOVEMBER(30), DECEMBER(31);

	private int noofdays;

	private Months(int noofdays) {
		this.noofdays = noofdays;
	}

	public void selectmonth() {
		System.out.println("you selected");
	}

	public int noofday() {
		return this.noofdays * 1;
	}

}
