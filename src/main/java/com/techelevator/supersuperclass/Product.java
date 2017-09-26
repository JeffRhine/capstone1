package com.techelevator.supersuperclass;

import java.math.BigDecimal;

import com.techelevator.superclasses.Candy;

public abstract class Product {
	protected String name;
	private BigDecimal price;
	private Integer quantity;
	
	public Product(String name, BigDecimal price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public abstract String getSound();

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void decrimentQuantity () {
		quantity--;
	}

	public void purchase (Integer desiredQuantity) {
		this.quantity -= desiredQuantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}	
}
