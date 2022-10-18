package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("configcollection.xml");
//		Employee e1 = (Employee) apc.getBean("employee1");
//		System.out.println(e1.getEmpName());
//		System.out.println(e1.getPhones());
//		System.out.println(e1.getAddress());
//		System.out.println(e1.getCourse());

		Car c = (Car) apc.getBean("car1");
		System.out.println(c);
	}

}
