package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentdao = ap.getBean("studao", StudentDao.class);
//		Student stu = new Student(123, "Akash", "Lucknow");
//		int r = studentdao.insert(stu);
//		System.out.println("inserted:::" + r);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("PRESS 1 for add new student");
			System.out.println("PRESS 2 for display all student");
			System.out.println("PRESS 3 for display single student details");
			System.out.println("PRESS 4 for updating student");
			System.out.println("PRESS 5 for deleting student");
			System.out.println("PRESS 6 for exit");

			try {
				int choice = Integer.parseInt(br.readLine());
				switch (choice) {
				case 1:
					// add new student
					// take input from user
					System.out.println("Enter student id");
					int stuId = Integer.parseInt(br.readLine());
					System.out.println("Enter student name");
					String stuName = br.readLine();
					System.out.println("Enter student city");
					String stuCity = br.readLine();

					// creating student obj and setting values
					Student stu = new Student(stuId, stuName, stuCity);

					// saving student object to database by calling insert of student dao
					int row = studentdao.insert(stu);
					System.out.println(row + " student added");
					System.out.println("***********************************************************");
					break;

				case 2:
					System.out.println("***********************************************************");
					List<Student> all = studentdao.getAll();
					for (Student s : all) {
						System.out.print(s + "\n");
					}
					System.out.println("***********************************************************");
					break;
				case 3:
					System.out.println("***********************************************************");
					System.out.println("Enter student id");
					int Id = Integer.parseInt(br.readLine());
					Student student = studentdao.getStudent(Id);
					System.out.println(student);
					System.out.println("***********************************************************");
					break;
				case 4:
					System.out.println("***********************************************************");
					break;
				case 5:
					System.out.println("***********************************************************");
					System.out.println("Enter student id");
					int id = Integer.parseInt(br.readLine());
					studentdao.deleteData(id);
					System.out.println("student deleted");
					System.out.println("***********************************************************");
					break;
				case 6:
					go = false;
					break;

				default:
					break;
				}

			} catch (Exception e) {
				System.out.println("Invalid input try with another with another one!!!");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("thanku for using application");
	}
}
