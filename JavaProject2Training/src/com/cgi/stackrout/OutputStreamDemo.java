package com.cgi.stackrout;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamDemo {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileOutputStream ft = new FileOutputStream("Sample.txt");
		String str = sc.nextLine();
		byte[] b = str.getBytes();
		ft.write(b);
		ft.close();
		System.out.println("successful...........");

	}

}
