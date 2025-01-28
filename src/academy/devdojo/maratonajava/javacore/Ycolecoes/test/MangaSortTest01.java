package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> outroManga = new ArrayList<>(6);
        outroManga.add(new Manga(5L,"Naruto Shipudden",19.9));
        outroManga.add(new Manga(1L,"Naruto Classico", 9.5));
        outroManga.add(new Manga(4L,"Dragon ball Z",3.2));
        outroManga.add(new Manga(3L,"Não conheço outros",11.20));
        outroManga.add(new Manga(2L,"Pokemon",50.05));

        for (Manga manga: outroManga){
            System.out.println(manga);
        }
        Collections.sort(outroManga);
        System.out.println("------------------");
        for (Manga mangs : outroManga){
            System.out.println(mangs);
        }

//        Collections.sort(outroManga, new MangaByIdComparator());
        outroManga.sort(new MangaByIdComparator());
        System.out.println("------------------");
        for (Manga mangs : outroManga){
            System.out.println(mangs);
        }
    }
}
