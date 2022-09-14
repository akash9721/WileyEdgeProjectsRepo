package com.java.classworkday4;

public class MainMethodOverloading {

	public static void main(int a) {
		// TODO Auto-generated method stub
		System.out.println("main method 2");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method 1");
		MainMethodOverloading mm = new MainMethodOverloading();
		mm.main(11);

	}

}
