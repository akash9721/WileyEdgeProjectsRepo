package com.spring.referenceType;

public class Address {
	private String state;
	private String town;
	private int houseNo;

	public Address() {

	}

	public Address(String state, String town, int houseNo) {
		super();
		this.state = state;
		this.town = town;
		this.houseNo = houseNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", town=" + town + ", houseNo=" + houseNo + "]";
	}

}
