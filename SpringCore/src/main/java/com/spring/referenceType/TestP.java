package com.spring.referenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestP {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("configref.xml");
		Student st = (Student) apc.getBean("student1");
		System.out.println(st);
	}

}