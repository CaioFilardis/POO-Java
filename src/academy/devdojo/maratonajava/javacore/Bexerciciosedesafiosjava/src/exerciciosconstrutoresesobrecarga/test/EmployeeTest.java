package exerciciosconstrutoresesobrecarga.test;

import exerciciosconstrutoresesobrecarga.dominio.Employee;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee("Caio", "Filardis", 1700.00);
        Employee employee1 = new Employee("Milena", "Pires", 2500.00);

        System.out.println("-------- First Object --------");
        System.out.printf("Nome: %s%n", employee.getName());
        System.out.printf("Sobrenome: %s%n", employee.getSobrenome());
        double salarioAnual = employee.getSalario() * 12;
        System.out.printf("Salario Anual: %.2f%n", salarioAnual);

        System.out.println();

        System.out.println("-------- Second Object --------");
        System.out.printf("Nome: %s%n", employee1.getName());
        System.out.printf("Sobrenome: %s%n", employee1.getSobrenome());
        double salarioAnual1 = employee1.getSalario() * 12;
        System.out.printf("Salario Anual: %.2f%n", salarioAnual1);

        System.out.println("\n------- Acrescimo -------");
        double salarioMensalAcrescido1 = salarioAnual * 0.01;
        double novoSalarioAnual1 = salarioMensalAcrescido1 * 12;
        System.out.printf("Novo salario anual pessoa 1: %.2f%n", novoSalarioAnual1);

        double salarioMensalAcrescido2 = salarioAnual1 * 0.01;
        double novoSalarioAnual2 = salarioMensalAcrescido2 * 12;
        System.out.printf("Novo salario anual pessoa 2: %.2f%n", novoSalarioAnual2);
    }
}
