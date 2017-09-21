package superclasses;

import java.math.BigDecimal;

import supersuperclass.Product;

public class Drinks extends Product {
	public Drinks (String name, BigDecimal price, int quantity) {
		super(name, price, quantity);
	}
	
	public String drinksSound = "Glub Glub, Yum!";

	@Override
	public String getSound() {
		return drinksSound;
	}
}
