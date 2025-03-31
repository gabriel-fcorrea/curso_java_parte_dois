package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("The current Dollar price is %.2f%n", CurrencyConverter.DOLLAR);
		System.out.print("How many dollars will be bought? ");

		double dollarBought = sc.nextDouble();

		double result = CurrencyConverter.dollarPrice(dollarBought);

		System.out.printf("Amount to be paid in reais = R$ %.2f%n", result);

		sc.close();
	}
}
