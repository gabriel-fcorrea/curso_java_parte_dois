package application;

import java.util.Scanner;

import entities.Grade;

public class Exercicio3 {

	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);

		Grade student = new Grade();
		System.out.print("Insira o nome do estudante: ");
		student.name = sc.nextLine();
		System.out.print("Insira a primeira nota: ");
		student.note1 = sc.nextDouble();
		System.out.print("Insira a segunda nota: ");
		student.note2 = sc.nextDouble();
		System.out.print("Insira a terceira nota: ");
		student.note3 = sc.nextDouble();
		System.out.println(student);

		sc.close();
	}
}
