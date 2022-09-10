package com.java.assignment;

public class ValidateDate {
	public static void main(String[] args) {
		Date d = new Date(30, 10, 2022);
		if (d.checkDate())
			System.out.println("Date is Valid");
		else {
			System.out.println("Date is not Valid");
		}

	}

}
