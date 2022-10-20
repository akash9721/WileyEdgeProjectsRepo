package com.spring.jdbc;

public interface CustomerDAO {
	public int addCustomer(Customer customer);

	public int updateCustomer(int custid);

	public boolean deleteCustomer(int custid);

}
