package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Sardinha", "No", "Re");
        String[] letter = words.get(0).split("");
        System.out.println(Arrays.toString(letter));

        List<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream(letter);
        List <String> letters2 = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(letters2);
    }
}
