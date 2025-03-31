package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		this.grossSalary = this.grossSalary + (this.grossSalary * (percentage / 100)) - tax;
	}

	public String toString() {
		return "Updated data: " + name + ", $ " + grossSalary;
	}
}
