package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import supersuperclass.Product;

public class VendingMachine {
	private BigDecimal balance = BigDecimal.ZERO;
	private List<String> purchases = new ArrayList<>();
	private Date date;
	private LogWriter lw = new LogWriter();
	private VendingMachine vm;
	
	Map<String, Product> inventory = new TreeMap<>();
	
	public char[] soundArray;
	
	public VendingMachine (Map<String, Product> inventory) {
		this.inventory = inventory;
	}
	
	public String [] itemNumber () {
		List<String> listOfItems = new ArrayList<>(inventory.keySet());
		String[] arrayOfKeys = listOfItems.toArray(new String [inventory.size()]);
		return arrayOfKeys;
	}
	
	public void purchase (String slotId) {
		if(inventory.containsKey(slotId) && balance.compareTo(inventory.get(slotId).getPrice()) >= 0) {
			if(inventory.get(slotId).getQuantity() > 0) {
				balance = balance.subtract(inventory.get(slotId).getPrice());
				inventory.get(slotId).decrimentQuantity();
				//Log the purchase
				soundArray = inventory.get(slotId).getSound().toCharArray();
				lw.writer(inventory.get(slotId).getName(), inventory.get(slotId).getPrice(), balance);
			}else{
				System.out.println("Sold Out");
			}
		}
	}
	
	public void feedMoney (BigDecimal userInput) {
		balance = balance.add(userInput);
		lw.writer("FEED ME MONEY!", userInput, balance);
	}
	
	public void change (BigDecimal userInput) {
		userInput = new BigDecimal("0.00");
		lw.writer("Give change", balance, userInput);
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
		return balance = new BigDecimal("0.00");
	}
	
	public BigDecimal getBalance() {
		return balance.setScale(2);
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance.setScale(2);
	}

	public List<String> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<String> purchases) {
		this.purchases = purchases;
	}

	public char[] getSoundArray() {
		return soundArray;
	}

}
