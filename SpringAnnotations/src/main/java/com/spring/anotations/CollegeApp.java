package com.spring.anotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeApp {
	public static void main(String[] args) {
		ApplicationContext ap = new AnnotationConfigApplicationContext(CollegeConfigs.class);
		College coll = ap.getBean("college", College.class);
		coll.display();
	}
}
