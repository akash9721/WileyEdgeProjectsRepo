package com.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository(value = "customerDaoJDBCSupportImpl")
public class CustomerDaoJDBCSupportImpl extends JdbcDaoSupport implements CustomerDAO {

	@Autowired
	public CustomerDaoJDBCSupportImpl(JdbcTemplate jdbcTemplate) {
		setJdbcTemplate(jdbcTemplate);

	}

	public int addCustomer(Customer customer) {
		int row = 0;
		String query = "insert into customer values(?,?)";
		row = getJdbcTemplate().update(query, customer.getCustid(), customer.getCustName());
		return row;
	}

	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean deleteCustomer(int custid) {
		// TODO Auto-generated method stub
		return false;
	}

}
