package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookJDBCTemplateDemo {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/spring/jdbc/bean.xml");
		CustomerDAO customerDAO = (CustomerDAO) ap.getBean("customerDAOImpl");
		int row = customerDAO.addCustomer(new Customer(101, "JOHN WILSON"));
		if (row > 0) {
			System.out.println("row inserted sucessfully");
		} else {
			System.out.println("record not inserted");
		}

	}
}
