package com.spring.jdbc;

public class Customer {
	private int custid;
	private String custName;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custid, String custName) {
		super();
		this.custid = custid;
		this.custName = custName;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custName=" + custName + "]";
	}

}
