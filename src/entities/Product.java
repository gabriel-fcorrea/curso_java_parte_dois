package entities;

public class Product {

	// ENCAPSULAMENTO COM PRIVATE
	private String name;
	private double price;
	private int quantity;

	// CONSTRUTOR PARA OBRIGAR A INSERÇÃO DE DADOS:
	public Product(String name, double price, int quantity) {
		// this - referencia o atributo do objeto e não o parâmetro do método
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// SOBRECARGA - OUTRO CONSTRUTOR SEM O ARGUMENTO DE QUANTIDADE
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		quantity = 0; // OPCIONAL, POR PADRÃO É INICIADO COM 0.
	}

	// SOBRECARGA SEM NENUM PARÂMETRO
	public Product() {

	}

	public double totalValueInStock() {
		return quantity * price;
	}

	// ENCAPSULAMENTO PARA QUE O ATRIBUTO SEJA ACESSADO PELA CLASSE
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return "Dados do produto: " + name + ", R$ " + String.format("%.2f", price) + ", " + quantity
				+ " unidades. Total: " + String.format("%.2f", totalValueInStock());
	}

}
