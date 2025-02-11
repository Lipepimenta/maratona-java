package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1. Order LightMovel by title
//2. Retrieve the first 3 light novels with price less than 4
public class StreamTest01 {
    private static List<LighNovel> lighNovels = List.of(
            new LighNovel("Tensei Shittara", 8.99),
            new LighNovel("Overlord", 7.89),
            new LighNovel("Violet", 3.99),
            new LighNovel("No Game", 2.99),
            new LighNovel("Kuma desuga", 5.89),
            new LighNovel("Monogatari", 4.00)
    );
    public static void main(String[] args) {
        lighNovels.sort(Comparator.comparing(LighNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LighNovel lighNovel : lighNovels) {
            if (lighNovel.getPrice() <=4){
                titles.add(lighNovel.getTitle());
            }
            if (titles.size() >=3){
                break;
            }
        }
        System.out.println(lighNovels);
        System.out.println(titles);
    }
}
