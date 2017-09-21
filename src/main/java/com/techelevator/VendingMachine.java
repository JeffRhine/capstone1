package com.techelevator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import supersuperclass.Product;

public class VendingMachine {
	private BigDecimal balance;
	private List<String> purchases;
	
	
	
	Map<String, Product> productMap = new HashMap<>();

	public BigDecimal addBalance (int userInputCash) {
		return balance.add(new BigDecimal(userInputCash));
	}

	public BigDecimal removeBalance () {
		return balance = new BigDecimal(0.00);
	}
	
	public void addProduct (String slotId, Product product) {
		productMap.put(slotId, product);
	}
	
	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public List<String> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<String> purchases) {
		this.purchases = purchases;
	}

	public Map<String, List<Product>> getProductList() {
		return productList;
	}

	public void setProductList(Map<String, List<Product>> productList) {
		this.productList = productList;
	}
		
}
