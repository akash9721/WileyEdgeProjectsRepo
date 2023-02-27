package com.java.streams;

import java.util.Random;

public class RandomNo {
	public static void main(String[] args) {
		Random ran = new Random();
		ran.ints(1, 5).limit(5).forEach(System.out::println);
	}

}
