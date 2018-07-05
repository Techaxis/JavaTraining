package com.techaxis.people;

public class CustomerInformation extends PersonalInformation {

	String orderFoodName;
	int quantity;
	double billingAmount;

	/**
	 * @return the orderFoodName
	 */
	public String getOrderFoodName() {
		return orderFoodName;
	}

	/**
	 * @param orderFoodName
	 *            the orderFoodName to set
	 */
	public void setOrderFoodName(String orderFoodName) {
		this.orderFoodName = orderFoodName;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the billingAmount
	 */
	public double getBillingAmount() {
		return billingAmount;
	}

	/**
	 * @param billingAmount
	 *            the billingAmount to set
	 */
	public void setBillingAmount(double billingAmount) {
		this.billingAmount = billingAmount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "CustomerInformation [orderFoodName=" + orderFoodName + ", quantity=" + quantity
				+ ", billingAmount=" + billingAmount + "]";
	}

}
