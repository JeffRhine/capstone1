package superclasses;

import supersuperclass.Product;

public abstract class Gum extends Product {
	public Gum (String name, String price, int quantity) {
		super(name, price, quantity);
	}
	
	public String drinksSound = "Chew Chew, Yum!";
}
