package com.java.streams;

public class Product {

	private int productId;
	private String productName;
	private String productCatagry;
	private int productPrice;

	public Product(int productId, String productName, String productCatagry, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCatagry = productCatagry;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCatagry() {
		return productCatagry;
	}

	public void setProductCatagry(String productCatagry) {
		this.productCatagry = productCatagry;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCatagry=" + productCatagry
				+ ", productPrice=" + productPrice + "]";
	}

}
