package application;

import java.util.Scanner;

import entities.BankTransactions;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankTransactions bankTransactions;

		System.out.print("Entre com o número da conta: ");
		int account = sc.nextInt();
		System.out.print("Entre com o nome do titular da conta: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Deseja realizar um depósito inicial? (S/N) ");

		char option = sc.nextLine().charAt(0);

		if (option == 'S' || option == 's') {
			System.out.print("Entre com o valor do depósito inicial: ");
			double firstDeposit = sc.nextDouble();
			bankTransactions = new BankTransactions(account, name, firstDeposit);
		} else {
			bankTransactions = new BankTransactions(account, name);
		}

		System.out.println(bankTransactions);

		System.out.print("Entre com um valor de depósito: ");
		double add = sc.nextDouble();
		bankTransactions.deposit(add);
		System.out.print(bankTransactions);

		System.out.print("Entre com um valor de saque: ");
		double remove = sc.nextDouble();
		bankTransactions.withdraw(remove);
		System.out.print(bankTransactions);

		sc.close();
	}
}
