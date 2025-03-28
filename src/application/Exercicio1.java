package application;

import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		System.out.print("Insira a largura do retângulo: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Insira a altura do retângulo: ");
		rectangle.height = sc.nextDouble();

		System.out.println("\n" + rectangle);

		System.out.printf("\nÁrea: %.2f%n", rectangle.areaRectangle());
		System.out.printf("Perímetro: %.2f%n", rectangle.perimeterRectangle());
		System.out.printf("Diagonal: %.2f%n", rectangle.diagonalRectangle());

		sc.close();

	}
}
