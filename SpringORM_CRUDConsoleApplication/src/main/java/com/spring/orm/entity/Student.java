package com.spring.orm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Details")
public class Student {
	@Id
	private int stuId;
	private String stuName;
	private String stuCity;

	public int getStuId() {
		return stuId;
	}

	public Student() {

	}

	public Student(int stuId, String stuName, String stuCity) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuCity = stuCity;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuCity() {
		return stuCity;
	}

	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuCity=" + stuCity + "]";
	}

}
