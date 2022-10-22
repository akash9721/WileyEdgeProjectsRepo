package com.spring.anotations;

import org.springframework.stereotype.Component;

@Component
public class MathsTeacher implements Teacher {

	public void teach() {
		System.out.println("I am maths teaching i will teach you maths");
	}

}
