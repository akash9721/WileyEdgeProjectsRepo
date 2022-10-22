package com.spring.anotations;

import org.springframework.stereotype.Component;

@Component("sci")
public class ScienceTeacher implements Teacher {

	public void teach() {
		System.out.println("I am science teaching i will teach you science");
	}

}
