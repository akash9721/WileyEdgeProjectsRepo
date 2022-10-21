package com.spring.jdbc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "customerDaoJDBCNamedParameterjdbcTemplateImp")
public class CustomerDaoJDBCNamedParameterjdbcTemplateImp implements CustomerDAO {

	@Autowired
	private NamedParameterJdbcTemplate jdbcnamedTemplate;

	public int addCustomer(Customer customer) {
		String query = "insert into customer values(:cusid,:cusName)";
		Map<String, Object> mp = new HashMap<String, Object>();
		mp.put("cusid", customer.getCustid());
		mp.put("cusName", customer.getCustName());
		int row = jdbcnamedTemplate.update(query, mp);
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
