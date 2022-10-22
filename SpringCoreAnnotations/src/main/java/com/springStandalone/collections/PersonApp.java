package com.springStandalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonApp {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springStandalone/collections/standalone.xml");
		Person per = ap.getBean("person1", Person.class);
		System.out.println(per);
	}

}
