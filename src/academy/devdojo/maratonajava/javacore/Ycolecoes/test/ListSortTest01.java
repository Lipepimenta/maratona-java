package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Naruto Shipudden");
        mangas.add("Naruto Classico");
        mangas.add("Dragon ball Z");
        mangas.add("Não conheço outros");
        mangas.add("Pokemon");

        Collections.sort(mangas);

        for (String manga : mangas){
            System.out.println(manga);
        }

        List<Integer> inteiros = new ArrayList<>(6);
        inteiros.add((int) 10.50);
        inteiros.add((int) 20.50);
        inteiros.add((int) 150.50);
        inteiros.add((int) 10.80);

        System.out.println(inteiros);
        Collections.sort(inteiros);
        System.out.println(inteiros);
    }
}
