package dominio;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		double newSalary = (grossSalary / percentage) + netSalary();
		System.out.printf("Dados atualizados: %s, $ %.2f", name, newSalary);
	}
	
	public String toString() {
		return "Employee: "
				+name
				+", $"
				+String.format("%.2f", netSalary());
	}
}
