package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTeste03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Filipe", "Sabrina", "Scooby-doo"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("10");
        System.out.println(num);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list,"Scooby-doo"));
    }
}
