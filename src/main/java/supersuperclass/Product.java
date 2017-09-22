package supersuperclass;

import java.math.BigDecimal;

public abstract class Product {
	private String name;
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
}
