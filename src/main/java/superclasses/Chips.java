package superclasses;

import supersuperclass.Product;

public abstract class Chips extends Product {
	public Chips(String name, String price, int quantity) {
		super(name, price, quantity);
	}
	
	public String chipsSound = "Crunch Crunch, Yum!";
}
