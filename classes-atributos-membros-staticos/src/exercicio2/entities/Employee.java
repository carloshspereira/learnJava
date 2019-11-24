package exercicio2.entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public void increaseSalary(double percentage) {
		grossSalary *= (percentage / 100 + 1);

	}

	@Override
	public String toString() {
		return String.format("%s, $ %.2f", name, netSalary());
	}

	private double netSalary() {
		return grossSalary - tax;
	}

}