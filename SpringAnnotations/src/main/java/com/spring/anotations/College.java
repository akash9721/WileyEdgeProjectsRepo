package com.spring.anotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Value("CGCTC")
	private String collegeName;

	@Value("${collegeLocation}")
	private String collegeLocation;

	@Autowired
	private Course course;

	@Autowired
	@Qualifier("sci")
	private Teacher teacher;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void display() {
		System.out.println("collegeName is:" + collegeName + " and College location is " + collegeLocation);
		course.show();
		teacher.teach();
	}

}
