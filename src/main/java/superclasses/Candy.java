package superclasses;

import supersuperclass.Product;

public abstract class Candy extends Product {
	public Candy (String name, String price, int quantity) {
		super(name, price, quantity);
	}
	
	public String candySound = "Munch Munch, Yum!";
}
