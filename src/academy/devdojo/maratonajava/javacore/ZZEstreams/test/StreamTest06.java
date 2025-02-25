package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;

import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LighNovel> lighNovels = List.of(
            new LighNovel("Tensei Shittara", 8.99),
            new LighNovel("Overlord", 7.89),
            new LighNovel("Violet", 3.99),
            new LighNovel("No Game", 2.99),
            new LighNovel("Kuma desuga", 5.89),
            new LighNovel("Monogatari", 4.00)
    );

    public static void main(String[] args){
        System.out.println(lighNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(lighNovels.stream().allMatch(ln -> ln.getPrice() > 9));
        System.out.println(lighNovels.stream().noneMatch(ln -> ln.getPrice() > 9));
        lighNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lighNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LighNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
