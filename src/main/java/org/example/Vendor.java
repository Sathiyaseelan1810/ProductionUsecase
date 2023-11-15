package org.example;

public class Vendor {
	
	private String vendorName;
	private Client client;
	public Vendor(String vendorName, Client client) {
		super();
		this.vendorName = vendorName;
		this.client = client;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "Vendor [vendorName=" + vendorName + ", client=" + client + "]";
	}
}