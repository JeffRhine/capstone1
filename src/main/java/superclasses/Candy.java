package superclasses;

import java.math.BigDecimal;

import supersuperclass.Product;

public class Candy extends Product {
	public Candy (String name, BigDecimal price, int quantity) {
		super(name, price, quantity);
	}
	
	public String candySound = "Munch Munch, Yum!";

	@Override
	public String getSound() {
		return candySound;
	}
}
