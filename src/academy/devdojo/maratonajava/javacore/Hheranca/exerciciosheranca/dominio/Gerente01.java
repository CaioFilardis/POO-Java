package academy.devdojo.maratonajava.javacore.Hheranca.exerciciosheranca.dominio;

public class Gerente01 extends Funcionario01 {

    public void aumentarSalario(double percentual, double bonus) {
        super.aumentarSalario(percentual);
        double valorBonificado = super.getSalario() + (super.getSalario() * bonus);
        System.out.printf("Valor após bônus: R$ %.2f", valorBonificado);
    }
}
