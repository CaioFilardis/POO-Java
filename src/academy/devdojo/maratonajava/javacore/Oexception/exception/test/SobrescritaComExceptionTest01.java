package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | ArithmeticException e) {
            
        }
    }
}
