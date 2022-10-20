package com.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "customerDAOImpl")
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int addCustomer(Customer customer) {
		int row = 0;
		String insertquery = "insert into customer values(?,?)";
		row = jdbcTemplate.update(insertquery, customer.getCustid(), customer.getCustName());
		return row;
	}

	public int updateCustomer(int custid) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean deleteCustomer(int custid) {
		// TODO Auto-generated method stub
		return false;
	}

}
