package dominio;

public class Funcionarios {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public String toString() {
		return "Funcionarios: "
				+name
				+", $ "
				+String.format("%.2f", netSalary());
	}
	
	public void increaseSalary(double porcentage) {
		double newSalary = netSalary() + (grossSalary / porcentage);
		System.out.println("Dados atualizados: "+name+", $ "+ newSalary);
	}
}
