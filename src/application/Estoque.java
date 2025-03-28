package application;

import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Product x = new Product();

		System.out.println("Insira as informações do produto abaixo:");
		System.out.print("Nome: ");
		x.name = sc.nextLine();
		System.out.print("Preço: ");
		x.price = sc.nextDouble();
		System.out.print("Quantidade: ");
		x.quantity = sc.nextInt();

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
