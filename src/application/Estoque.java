package application;

import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Product x, y, z;
		x = new Product();
		y = new Product();
		z = new Product();

		System.out.println("Insira as informações do produto abaixo:");
		x.addProducts();
		x.totalValueInStock();
//		y.addProducts();
//		y.totalValueInStock();
//		z.addProducts();
//		z.totalValueInStock();

		System.out.printf("A valor total é R$ %.2f%n", x.totalValueInStock());

		sc.close();
	}

}
