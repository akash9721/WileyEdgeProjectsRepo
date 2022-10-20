package com.spring.studentjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.studentjdbc.Student;

@Repository(value = "studentDaoImpl")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		int row = 0;
		String query = "insert into student(id,name,city) values(?,?,?)";
		row = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return row;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
