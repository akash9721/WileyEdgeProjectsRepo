package com.interviewQuestions;

import java.util.Scanner;

class Department {
	private String departmentName;
	Staff staff;

	public Department(String departmentName, Staff staff) {
		this.departmentName = departmentName;
		this.staff = staff;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void display() {
		System.out.println(staff.getStaffName() + " is working in the " + departmentName + " department as "
				+ staff.getDesignation());
	}

}

class Staff {
	private String staffName;
	private String designation;

	public Staff(String staffName, String designation) {
		this.staffName = staffName;
		this.designation = designation;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}

public class Aggregation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stafname = sc.nextLine();
		String design = sc.nextLine();
		String deptname = sc.nextLine();
		Staff s = new Staff(stafname, design);
		Department d = new Department(deptname, s);
		d.display();

	}

}
