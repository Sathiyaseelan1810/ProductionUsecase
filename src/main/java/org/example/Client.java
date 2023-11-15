package org.example;

public class Client {

	private String clientName;
	private Product product;

	public Client(String clientName, Product product) {
		super();
		this.clientName = clientName;
		this.product = product;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Client [clientName=" + clientName + ", product=" + product + "]";
	}
}