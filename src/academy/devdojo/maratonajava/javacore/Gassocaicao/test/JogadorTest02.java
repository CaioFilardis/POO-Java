package academy.devdojo.maratonajava.javacore.Gassocaicao.test;

import academy.devdojo.maratonajava.javacore.Gassocaicao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassocaicao.dominio.Time;

public class JogadorTest02 {

    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Seleção");

        //jogador.setTime(time);
        jogador.imprime();
    }
}
