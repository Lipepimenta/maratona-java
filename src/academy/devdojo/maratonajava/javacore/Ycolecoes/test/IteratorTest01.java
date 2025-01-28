package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Naruto Shipudden",19.9, 0));
        mangas.add(new Manga(1L,"Naruto Classico", 9.5,5));
        mangas.add(new Manga(4L,"Dragon ball Z",3.2,0));
        mangas.add(new Manga(3L,"Não conheço outros",11.20,0));
        mangas.add(new Manga(2L,"Pokemon",50.05,0));

//        Iterable<Manga> mangaIterable = mangas.iterator();
//        while (mangaIterable.hasNext()){
//            if (mangaIterable.next().getQuantidade() == 0){
//                mangaIterable.remove();
//            }
//            System.out.println(mangas);
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
