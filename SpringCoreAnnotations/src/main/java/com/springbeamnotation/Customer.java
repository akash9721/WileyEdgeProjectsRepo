package com.springbeamnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Value("akash")
	private String name;
	@Value("123")
	private int cusId;

	@Autowired
	private Address address;

	public Customer() {

	}

//	public Address getAddress() {
//		return address;
//	}
//
//	@Autowired
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", cusId=" + cusId + ", address=" + address + "]";
	}

}
