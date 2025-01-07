package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }
    }
}
