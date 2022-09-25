package com.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CustomerUtility {

	public void show(List<Customer> cur) {
		cur.forEach((n) -> System.out.println(n));
	}

	public void display(List<Customer> cur) {
		CustomerBillSort billsort = new CustomerBillSort();
		Collections.sort(cur, billsort);
		show(cur);
	}

	public void displayWithSameAreaCode(List<Customer> cur, String areacode) {
		for (Customer cs : cur) {
			if (cs.getCustomerAreaCode().equals(areacode)) {
				System.out.println(cs);
			}
		}
	}

	public void mapDataWithSameAreaCode(List<Customer> cur, Map<String, List<Customer>> mpl) {
		for (Customer lt : cur) {
			String key = lt.getCustomerAreaCode();
			mpl.putIfAbsent(key, new ArrayList<Customer>());
			mpl.get(key).add(lt);
		}
		System.out.println(mpl);
	}
}
