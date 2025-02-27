package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LighNovel> lighNovels = new ArrayList<>(List.of(
            new LighNovel("Tensei Shittara", 8.99),
            new LighNovel("Overlord", 7.89),
            new LighNovel("Violet", 3.99),
            new LighNovel("No Game", 2.99),
            new LighNovel("Kuma desuga", 5.89),
            new LighNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        lighNovels.stream()
                .map(LighNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = 0.0;
        for (LighNovel lighNovel : lighNovels) {
            double price = lighNovel.getPrice();
            if (price > 3) {
                sum += price;
            }
        }
    }
}
