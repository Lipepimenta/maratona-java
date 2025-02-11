package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LighNovel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Pimenta", "Sabrina", "Samuel");
        List<String> developers = List.of("Filipe", "Willian", "Matheus");
        List<String> students = List.of("Davi", "Gustavo", "Gabriel");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }

        }

        System.out.println("---------------");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
