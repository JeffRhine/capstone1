package superclasses;

import java.math.BigDecimal;

import supersuperclass.Product;

public class Gum extends Product {
	public Gum (String name, BigDecimal price, int quantity) {
		super(name, price, quantity);
	}
	
	public String gumSound = "Chew Chew, Yum!";

	@Override
	public String getSound() {
		return gumSound;
	}
}
