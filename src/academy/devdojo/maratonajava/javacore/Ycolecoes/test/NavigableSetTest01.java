package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangasPorPreco implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("12345", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangasPorPreco());
        mangas.add(new Manga(5L,"Naruto Shipudden",19.9, 0));
        mangas.add(new Manga(1L,"Naruto Classico", 9.5,5));
        mangas.add(new Manga(4L,"Dragon ball Z",3.2,0));
        mangas.add(new Manga(3L,"Não conheço outros",11.20,0));
        mangas.add(new Manga(2L,"Pokemon",2.05,0));
        mangas.add(new Manga(6L,"Anta aquatica",60.05,0));
        for (Manga manga : mangas){
            System.out.println(manga);
        }

        Manga yuyu = new Manga(1L,"yuyu Hasuko", 3.2,5);
        System.out.println("------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));
    }
}
