package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

//1. Order LightMovel by title
//2. Retrieve the first 3 light novels with price less than 4
public class StreamTest02 {
    private static List<LighNovel> lighNovels = List.of(
            new LighNovel("Tensei Shittara", 8.99),
            new LighNovel("Overlord", 7.89),
            new LighNovel("Violet", 3.99),
            new LighNovel("No Game", 2.99),
            new LighNovel("Kuma desuga", 5.89),
            new LighNovel("Monogatari", 4.00)
    );

    public static void main(String[] args) {
        List<String> titles = lighNovels.stream()
                .sorted(comparing(LighNovel::getTitle))
                .filter(lighNovel -> lighNovel.getPrice() <= 4)
                .limit(3)
                .map(LighNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
