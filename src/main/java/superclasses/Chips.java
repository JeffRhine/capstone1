package superclasses;

import java.math.BigDecimal;

import supersuperclass.Product;

public class Chips extends Product {
	public Chips(String name, BigDecimal price, int quantity) {
		super(name, price, quantity);
	}
	
	public String chipsSound = "Crunch Crunch, Yum!";

	@Override
	public String getSound() {
		return chipsSound;
	}
}
