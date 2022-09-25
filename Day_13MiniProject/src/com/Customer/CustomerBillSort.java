package com.Customer;

import java.util.Comparator;

public class CustomerBillSort implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return (int) (o2.displayTotalBill() - o1.displayTotalBill());
	}

}
