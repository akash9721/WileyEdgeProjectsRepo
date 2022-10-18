package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
//		using setter injection
//		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
//		Student st1 = (Student) con.getBean("Student1");
//		Student st2 = (Student) con.getBean("Student2");
//		System.out.println(st1);
//		System.out.println(st2);

		// using constructor injection
		ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
		Student st1 = (Student) ap.getBean("st1");
		System.out.println(st1);
	}
}
