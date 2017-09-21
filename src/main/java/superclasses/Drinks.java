package superclasses;

import supersuperclass.Product;

public abstract class Drinks extends Product {
	public Drinks (String name, String price, int quantity) {
		super(name, price, quantity);
	}
	
	public String drinksSound = "Glub Glub, Yum!";
}
