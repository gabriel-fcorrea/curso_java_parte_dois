package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("What's the dollar price? ");
		double x = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double y = sc.nextDouble();

		double total = CurrencyConverter.dollarConversor(x, y);

		System.out.printf("Amount to be paid in reais = R$ %.2f%n", total);

		sc.close();
	}
}
