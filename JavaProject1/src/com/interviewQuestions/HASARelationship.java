package com.interviewQuestions;

class CollStudent {
	private String stuName;
	private String stuId;

	public CollStudent(String stuName, String stuId) {
		super();
		this.stuName = stuName;
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public void display(Address adr) {
		System.out.println("student name is " + this.stuName + " and address is " + adr.getAddress());
	}
}

class Address {
	private String address;
	private int pincode;

	public Address(String address, int pincode) {
		super();
		this.address = address;
		this.pincode = pincode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}

public class HASARelationship {
	public static void main(String[] args) {
		Address add = new Address("Utter Pradesh", 272131);
		CollStudent stu = new CollStudent("Akash kumar", "1816519");
		stu.display(add);
	}

}
