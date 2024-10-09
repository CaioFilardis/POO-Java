package academy.devdojo.maratonajava.javacore.Gassocaicao.test;

import academy.devdojo.maratonajava.javacore.Gassocaicao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassocaicao.dominio.Time;
import academy.devdojo.maratonajava.javacore.Gassocaicao.zexercicios.dominio.Departamento;

public class JogadorTest03 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Messi");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        Time time = new Time("Seleção do mundo");

        jogador1.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
