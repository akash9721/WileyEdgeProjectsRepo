package com.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired
	private Address address;

	public Employee() {
	}

	// @Autowired we can also use here
	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	// @Autowired we can also use here
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmpApp [address=" + address + "]";
	}

}
