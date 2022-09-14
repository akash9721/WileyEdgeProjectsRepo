package com.cgi.stackrout;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("Sample.txt");
		int i = 0;
		while ((i = fi.read()) != -1) {
			System.out.print((char) i);
		}
		System.out.print((char) i); // reading one character

	}

}
