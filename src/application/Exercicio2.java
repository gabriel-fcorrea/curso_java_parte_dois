package application;

import java.util.Scanner;

import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		double x;
		System.out.print("Insira o nome do funcionário: ");
		employee.name = sc.nextLine();
		System.out.print("Insira o valor do Salário Bruto: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Insira o valor do Imposto: ");
		employee.tax = sc.nextDouble();

		System.out.println("Employee: " + employee.name + ", $" + employee.netSalary());
		System.out.print("Which percentag" + "e to increase salary? ");
		x = sc.nextDouble();
		employee.increaseSalary(x);

		System.out.println();
		System.out.println(employee);

		sc.close();
	}
}
