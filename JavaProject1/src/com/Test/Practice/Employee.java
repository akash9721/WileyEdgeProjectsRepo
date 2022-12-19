package com.Test.Practice;

public class Employee {
	private String empName;
	private double empSal;
	private String org;

	public Employee(String empName, double empSal, String org) {
		super();
		this.empName = empName;
		this.empSal = empSal;
		this.org = org;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSal=" + empSal + ", org=" + org + "]";
	}

}
