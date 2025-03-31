package application;

import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira as informações do produto abaixo:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		Product x = new Product(name, price);

		// UTILIZAÇÃO DO MÉTODO PARA ALTERAÇÃO DE UM ATRIBUTO APÓS ENCAPSULAMENTO
		x.setName("Computer");
		System.out.println("Updated name: " + x.getName());

		x.setPrice(1200);
		System.out.println("Updated price: " + x.getPrice());

		System.out.println(x);

		char opcao;
		do {
			System.out.println("O que deseja fazer? \n1. Adicionar uma quantidade \n2. Remover uma quantidade");
			int y = sc.nextInt();
			int z;
			switch (y) {
			case 1:
				System.out.print("Quantidade a adicionar: ");
				z = sc.nextInt();
				x.addProducts(z);
				System.out.println();
				System.out.println(x);
				break;
			case 2:
				System.out.print("Quantidade a remover: ");
				z = sc.nextInt();
				x.removeProducts(z);
				System.out.println();
				System.out.println(x);
				break;
			}
			System.out.println("Deseja alterar a quantidade? (S/N)");
			opcao = sc.next().charAt(0);
		} while (opcao == 's' || opcao == 'S');

		sc.close();
	}

}
