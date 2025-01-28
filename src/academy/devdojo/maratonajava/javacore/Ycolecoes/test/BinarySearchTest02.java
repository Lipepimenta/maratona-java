package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> outroManga = new ArrayList<>(6);
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        outroManga.add(new Manga(5L,"Naruto Shipudden",19.9));
        outroManga.add(new Manga(1L,"Naruto Classico", 9.5));
        outroManga.add(new Manga(4L,"Dragon ball Z",3.2));
        outroManga.add(new Manga(3L,"Não conheço outros",11.20));
        outroManga.add(new Manga(2L,"Pokemon",50.05));

//        Collections.sort(outroManga);
        outroManga.sort(mangaByIdComparator);
        for (Manga manga : outroManga){
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(4L, "Dragon ball Z", 3.2);
        System.out.println(Collections.binarySearch(outroManga, mangaToSearch, mangaByIdComparator));
    }
}
