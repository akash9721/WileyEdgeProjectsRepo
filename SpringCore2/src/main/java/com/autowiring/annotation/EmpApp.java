package com.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {
	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext(
				"com/autowiring/annotation/autowireanotationconfig.xml");
		Employee e1 = ap.getBean("emp", Employee.class);
		System.out.println(e1);
	}

}
