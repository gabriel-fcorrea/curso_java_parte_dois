package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Entre com as dimensões do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		double areaX = x.area();

		System.out.printf("Área do triângulo X: %.4f%n", areaX);

		System.out.println("Entre com as dimensões do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaY = y.area();

		System.out.printf("Área do triângulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("A área de X é maior.");
		} else {

			System.out.println("A área de Y é maior.");

		}

		sc.close();

	}
}
