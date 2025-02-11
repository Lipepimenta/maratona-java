package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;

import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LighNovel> lighNovels = List.of(
            new LighNovel("Tensei Shittara", 8.99),
            new LighNovel("Overlord", 7.89),
            new LighNovel("Violet", 3.99),
            new LighNovel("No Game", 2.99),
            new LighNovel("Kuma desuga", 5.89),
            new LighNovel("Monogatari", 4.00)
    );

    public static void main(String[] args) {
        Stream<LighNovel> stream = lighNovels.stream();
        lighNovels.forEach(System.out::println);

        long count = stream
                .distinct()
                .filter(ln -> ln.getPrice() <=4)
                .count();

        System.out.println(count);
    }
}
