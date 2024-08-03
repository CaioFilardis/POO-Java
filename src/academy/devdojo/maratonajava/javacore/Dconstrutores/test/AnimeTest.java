package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {

    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 25, "Ação", "Toiyama");
        anime.imprime();
    }
}
