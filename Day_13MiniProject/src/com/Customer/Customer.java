package com.Customer;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAreaCode;
	private double numberofUnitsConsumed;
	double totalBill;

	public Customer(int customerId, String customerName, String cusAreaCode, double numberofUnitsConsumed) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAreaCode = cusAreaCode;
		this.numberofUnitsConsumed = numberofUnitsConsumed;
		this.totalBill = totalBill;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAreaCode() {
		return customerAreaCode;
	}

	public void setCustomerAreaCode(String customerAreaCode) {
		this.customerAreaCode = customerAreaCode;
	}

	public double getNumberofUnitsConsumed() {
		return numberofUnitsConsumed;
	}

	public void setNumberofUnitsConsumed(double numberofUnitsConsumed) {
		this.numberofUnitsConsumed = numberofUnitsConsumed;
	}

	public double displayTotalBill() {
		if (numberofUnitsConsumed <= 100) {
			totalBill = numberofUnitsConsumed * 0.5;
		} else if (numberofUnitsConsumed <= 150) {
			totalBill = (100 * 0.5) + (numberofUnitsConsumed - 100) * 0.75;
		} else {
			totalBill = (100 * 0.5) + (50 * .75) + (numberofUnitsConsumed - 150) * 1;
		}
		return totalBill;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer [CustomerId: " + this.customerId + ",Customername: " + this.customerName
				+ ", CustomerAreacode: " + this.customerAreaCode + ", Numberofunitconsumed: "
				+ this.numberofUnitsConsumed + ", totalbill: " + displayTotalBill() + "]";
	}

}
