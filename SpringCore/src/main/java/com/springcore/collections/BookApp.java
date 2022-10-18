package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookApp {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/collections/bookconfig.xml");

//		BookLibraray bl = (BookLibraray) ac.getBean("booklist");
//		bl.showBook();
		// System.out.println(bl);

//		BookSetLibrary bl = (BookSetLibrary) ac.getBean("bookset");
//		bl.display();

//		BookMapLibrary bm = (BookMapLibrary) ac.getBean("bookmap");
//		bm.displayMapdata();

		BookMapStringList bml = (BookMapStringList) ac.getBean("bookmaplist");
		bml.displayData();
	}

}
