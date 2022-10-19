package com.springbean.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {
	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springbean/autowiring/autowireconfig.xml");
		Employee e1 = ap.getBean("emp", Employee.class);
		System.out.println(e1);
	}

}
