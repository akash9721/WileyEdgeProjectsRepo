package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entity.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	// save student
	@Transactional
	public int insert(Student student) {
		// insert
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;

	}

	// get single data
	public Student getStudent(int studId) {
		Student student = this.hibernateTemplate.get(Student.class, studId);
		return student;
	}

	// get list of data
	public List<Student> getAll() {
		List<Student> all = this.hibernateTemplate.loadAll(Student.class);
		return all;
	}

	// updateing data
	@Transactional
	public void update(Student student) {
		this.hibernateTemplate.update(student);
	}

	// deleting data
	@Transactional
	public void deleteData(int stuId) {
		Student student = this.hibernateTemplate.get(Student.class, stuId);
		this.hibernateTemplate.delete(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
