package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L,"Naruto Shipudden",19.9, 0));
        mangas.add(new Manga(1L,"Naruto Classico", 9.5,5));
        mangas.add(new Manga(4L,"Dragon ball Z",3.2,0));
        mangas.add(new Manga(3L,"Não conheço outros",11.20,0));
        mangas.add(new Manga(2L,"Pokemon",50.05,0));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
