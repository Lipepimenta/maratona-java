package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Filipe Pimenta");
        Consumidor consumidor2 = new Consumidor("Willian Suane");

        Manga manga1 = new Manga(5L,"Naruto Shipudden",19.9);
        Manga manga2 = new Manga(1L,"Naruto Classico", 9.5);
        Manga manga3 = new Manga(4L,"Dragon ball Z",3.2);
        Manga manga4 = new Manga(3L,"Não conheço outros",11.20);
        Manga manga5 = new Manga(2L,"Pokemon",50.05);

        List <Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List <Manga> mangaConsumidor2List = List.of(manga4, manga5);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, mangaConsumidor1List);
        consumidorManga.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()){
            System.out.println("-"+entry.getKey().getNome());
            for (Manga manga : entry.getValue()){
                System.out.println("-->"+manga.getNome());
            }
        }

    }
}
