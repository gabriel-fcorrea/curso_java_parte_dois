package entities;

import java.util.Scanner;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return quantity * price;
	}

	public void addProducts() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Preço: ");
		price = sc.nextDouble();
		System.out.print("Quantidade: ");
		quantity = sc.nextInt();
		sc.close();
	}

	public void removeProducts(int quantity) {

	}

}
