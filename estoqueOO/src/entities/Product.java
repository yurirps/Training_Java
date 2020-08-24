package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	// aqui é o contrutor
	public Product(String name, double price, int quantity) { // agora atribuir/referenciar o valor as variaveis usando
																// this
		this.name = name; // o this referencia ao atributo, sem ele referencia ao parametro
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) { // agora atribuir/referenciar o valor as variaveis usando this
		this.name = name; // o this referencia ao atributo, sem ele referencia ao parametro
		this.price = price;
		// a linguagem java por padrão recebe 0
	}

	// get e setters

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	// ---------------------------

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + "units, Total: $ "
				+ String.format("%.2f", totalValueInStock());

	}

}
