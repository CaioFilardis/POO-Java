package academy.devdojo.maratonajava.javacore.Gassocaicao.test;

import academy.devdojo.maratonajava.javacore.Gassocaicao.dominio.Jogador;

public class JogadorTest01 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = new Jogador[] {jogador1, jogador2, jogador3};

      for (Jogador jogador:jogadores) {
          System.out.println(jogador.getNome());
      }
    }
}
