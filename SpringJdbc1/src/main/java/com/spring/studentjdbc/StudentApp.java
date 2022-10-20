package com.spring.studentjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.studentjdbc.dao.StudentDao;

public class StudentApp {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/spring/studentjdbc/studentbean.xml");
		StudentDao studentDao = ap.getBean("studentDaoImpl", StudentDao.class);
		int row = studentDao.insert(new Student(1, "Akash Kumar", "Utter-Pradesh"));
		if (row > 0) {
			System.out.println("row is inserted");
		} else {
			System.out.println("row is not inserted");
		}
	}

}
