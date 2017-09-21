package com.techelevator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import supersuperclass.Product;

public class VendingMachine {
	private BigDecimal balance;
	private List<String> purchases;
	
	
	
	Map<String, Product> inventory = new HashMap<>();
	
	public VendingMachine (Map<String, Product> inventory) {
		this.inventory = inventory;
	}
	
	public BigDecimal feedMoney (BigDecimal dollar) {
		return balance.add(dollar);
	}
	
	public String completeTransaction () {
		System.out.println(toString());
		return toString();
	}

	public boolean isSoldOut (String slot) {
		if(inventory.get(3).equals(0)) {
			return true;
		}
		return false;
	}
	
	public Map<String, Product> getInventory () {
		return inventory;
	}
	
	public BigDecimal addBalance (int userInputCash) {
		return balance.add(new BigDecimal(userInputCash));
	}

	public BigDecimal removeBalance () {
		return balance = new BigDecimal(0.00);
	}
	
//	public String finishTransaction () {
	
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

}
