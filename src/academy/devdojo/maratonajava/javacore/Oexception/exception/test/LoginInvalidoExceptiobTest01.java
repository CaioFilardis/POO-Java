package academy.devdojo.maratonajava.javacore.Oexception.exception.test;


import academy.devdojo.maratonajava.javacore.Oexception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptiobTest01 {

    public static void main(String[] args) {
       try {
           logar();
       } catch (LoginInvalidoException e) {
           e.printStackTrace();
       }
    }

    public static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String userNameDb = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if (!userNameDb.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
