package com.myspace.tests;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Line implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String product;
	private java.lang.Integer amount;
	private java.lang.Double price;
	private java.lang.Double total;

	public Line() {
	}

	public java.lang.String getProduct() {
		return this.product;
	}

	public void setProduct(java.lang.String product) {
		this.product = product;
	}

	public java.lang.Integer getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.Integer amount) {
		this.amount = amount;
	}

	public java.lang.Double getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.Double price) {
		this.price = price;
	}

	public java.lang.Double getTotal() {
		return this.total;
	}

	public void setTotal(java.lang.Double total) {
		this.total = total;
	}

	public Line(java.lang.String product, java.lang.Integer amount,
			java.lang.Double price, java.lang.Double total) {
		this.product = product;
		this.amount = amount;
		this.price = price;
		this.total = total;
	}

}