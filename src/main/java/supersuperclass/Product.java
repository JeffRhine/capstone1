package supersuperclass;

public abstract class Product {
	private String name;
	private String price;
	private int quantity;
	
	public Product(String name, String price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public abstract String getSound();

	public String getName() {
		return name;
	}

	public String getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void purchase (int desiredQuantity) {
		this.quantity -= desiredQuantity;
	}	
}
