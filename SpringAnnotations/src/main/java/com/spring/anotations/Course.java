package com.spring.anotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	@Value("Computer-Science")
	private String courseName;

	@Value("4")
	private int durations;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDurations() {
		return durations;
	}

	public void setDurations(int durations) {
		this.durations = durations;
	}

	public void show() {
		System.out.println("courseName is: " + courseName + "   and durations is: " + durations);
	}

}
