package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Product products;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, Product products) {
		this.quantity = quantity;
		this.price = price;
		this.products = products;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}
	
	public Double subTotal() {
		return quantity * price;
	}
	
	@Override
	public String toString() {
		return  getProducts().getName()
				+ ", $" + 
				String.format("%.2f", products.getPrice())
				+ ", Quantity: " 
				+ quantity 
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}

}
