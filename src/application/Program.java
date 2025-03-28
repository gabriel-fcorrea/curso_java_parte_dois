package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double XA, XB, XC, YA, YB, YC;

		System.out.println("Entre com as dimensões do triângulo X:");
		XA = sc.nextDouble();
		XB = sc.nextDouble();
		XC = sc.nextDouble();
		double pX = (XA + XB + XC) / 2;
		double qX = pX * (pX - XA) * (pX - XB) * (pX - XC);
		double areaX = Math.sqrt(qX);

		System.out.printf("Área do triângulo X: %.4f%n", areaX);

		System.out.println("Entre com as dimensões do triângulo Y: ");
		YA = sc.nextDouble();
		YB = sc.nextDouble();
		YC = sc.nextDouble();
		double pY = (YA + YB + YC) / 2;
		double qY = pY * (pY - YA) * (pY - YB) * (pY - YC);
		double areaY = Math.sqrt(qY);

		System.out.printf("Área do triângulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("A área de X é maior.");
		} else {

			System.out.println("A área de Y é maior.");

		}

		sc.close();

	}
}
