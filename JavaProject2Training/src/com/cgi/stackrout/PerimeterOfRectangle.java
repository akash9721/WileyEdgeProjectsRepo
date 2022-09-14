package com.cgi.stackrout;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth of the rectangle:");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		double perimeter = 2 * (length + breadth);
		System.out.println(perimeter);

	}

}
