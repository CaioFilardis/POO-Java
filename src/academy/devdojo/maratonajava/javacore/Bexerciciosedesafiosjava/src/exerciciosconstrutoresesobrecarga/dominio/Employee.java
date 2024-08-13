package exerciciosconstrutoresesobrecarga.dominio;

public class Employee {

    private String name;
    private String sobrenome;
    private double salario;

    public Employee(String name, String sobrenome, double salario) {
        this.name = name;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSalario(double salario) {
        while (salario < 0) {
            System.out.println("Salário inválido");
            return;
        }
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

}
