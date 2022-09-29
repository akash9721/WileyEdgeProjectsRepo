package com.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustomerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Customer> cur = new ArrayList<Customer>();
		CustomerUtility cu = new CustomerUtility();
		Map<String, List<Customer>> mpl = new HashMap<String, List<Customer>>();
		int i = 0;
		int n = 1;
		while (n != 0) {
			System.out.println("Enter " + (i + 1) + " Customer details: ");
			System.out.print("Enter customer id:  ");
			int custId = sc.nextInt();
			System.out.print("Enter customer name:  ");
			String custName = sc.next();
			System.out.print("Enter area code:  ");
			String cusAreaCode = sc.next();
			System.out.print("Enter no of unit:  ");
			double noUnit = sc.nextDouble();
			cur.add(new Customer(custId, custName, cusAreaCode, noUnit));
			System.out.println("if you want add more data enter: (YES/NO)");
			String s = sc.next();
			n = s.equalsIgnoreCase("Yes") ? 1 : 0;
			i++;
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Display all customer details");
		cu.show(cur);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Display customer details with their sorted bill in descending order");
		cu.display(cur);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Enter customerAreaCode");
		String cusAreaCode = sc.next();
		System.out.println("Display the details of the customers in the given customerAreaCode");
		cu.displayWithSameAreaCode(cur, cusAreaCode);
		System.out.println("-----------------------------------------------------------------------");
		cu.serialization(cur);
		cu.deSerialized(cur);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Display the details of the customers maped with customerAreaCode");
		cu.mapDataWithSameAreaCode(cur, mpl);

	}

}
