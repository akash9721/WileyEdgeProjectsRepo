package com.springbeamlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class CarApp {
	public static void main(String[] args) {
		AbstractApplicationContext ap = new ClassPathXmlApplicationContext("com/springbeamlifecycle/config.xml");
//		Car car = (Car) ap.getBean("c1");
//		System.out.println(car);
//		// registring shutdown hook
//		ap.registerShutdownHook();

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		City city = (City) ap.getBean("city1");
		System.out.println(city);
		// registring shutdown hook
		ap.registerShutdownHook();
	}
}
