package org.example;

public class Customer {

	Integer customerId;
	String customerName;
	String customerBranch;
	Double customerProfit;

	public Customer(int customerId, String customerName, String customerBranch, Double customerProfit) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBranch = customerBranch;
		this.customerProfit = customerProfit;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerBranch() {
		return customerBranch;
	}

	public void setCustomerBranch(String customerBranch) {
		this.customerBranch = customerBranch;
	}

	public Double getCustomerProfit() {
		return customerProfit;
	}

	public void setCustomerProfit(Double customerProfit) {
		this.customerProfit = customerProfit;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBranch="
				+ customerBranch + ", customerProfit=" + customerProfit + "]";
	}
}