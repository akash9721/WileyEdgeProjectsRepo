package com.interviewQuestions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DiiffWayOfCreatingStudentObj {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException,
			InvocationTargetException, CloneNotSupportedException, IOException {

		// 1. using new keyword
		Student s1 = new Student();
		s1.setName("akk");
		System.out.println(s1.getName() + "\n");

		// 2. using newStance method of class class, in this we have to load the class
		Student s2 = (Student) Class.forName("com.interviewQuestions.Student").newInstance();
		s2.setCompany("XYZ");
		System.out.println(s2.getCompany() + "\n");

		// 2.1
		Student s3 = Student.class.newInstance();
		s3.setId(12345);
		System.out.println(s3.getId() + "\n");

		// 3.using newStance method of Constructor class
		Constructor<Student> constructor = Student.class.getConstructor();
		Student s4 = constructor.newInstance();
		System.out.println(s4);
		s4.setCompany("wiley");
		System.out.println(s4.getCompany() + "\n");

		// 4.using clone method
		Student s5 = (Student) s4.clone();
		System.out.println(s5);
		s5.setName("Akash");
		System.out.println(s5.getName() + "\n");

		// 5.using serialization and deserialization method

		Student s6 = new Student();
		FileOutputStream fos = new FileOutputStream(new File("student.dat"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s6);
		System.out.println("object is serialized");

		FileInputStream fis = new FileInputStream("student.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s7 = (Student) ois.readObject();
		System.out.println(s7);
		s7.setId(1919191);
		System.out.println(s7.getId());

	}

}
