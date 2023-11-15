package org.example;

import java.util.Map;

public class Product {

	private Map<String, String> products;

	public Product(Map<String, String> products) {
		super();
		this.products = products;
	}

	@Override
	public String toString() {
		return "Product [products=" + products + "]";
	}

	public Map<String, String> getProducts() {
		return products;
	}

	public void setProducts(Map<String, String> products) {
		this.products = products;
	}

}