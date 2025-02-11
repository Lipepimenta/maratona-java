package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTeste02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Dragon ball", 300), new Anime("Naruto", 500), new Anime("7 Pecados Capitais", 100)));
        animeList.sort(animeComparators::compareByTitlesNonStatic);
        animeList.sort((a1, a2) -> animeComparators.compareByTitlesNonStatic(a1, a2));
        System.out.println(animeList);

    }
}
