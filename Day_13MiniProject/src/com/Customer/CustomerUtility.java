package com.Customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

	public void serialization(List<Customer> cur) {
		try {
			FileOutputStream fos = new FileOutputStream(new File("customer.dat"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cur);
			System.out.println("objects are serialize");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deSerialized(List<Customer> cur) {
		try {
			FileInputStream fis = new FileInputStream("customer.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<Customer> outputis = (List<Customer>) ois.readObject();
			System.out.println("Deserialized data are:");
			for (Customer data : outputis) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
