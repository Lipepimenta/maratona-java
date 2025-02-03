package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Filipe Pimenta");
        Consumidor consumidor2 = new Consumidor("Willian Suane");

        Manga manga1 = new Manga(5L,"Naruto Shipudden",19.9);
        Manga manga2 = new Manga(1L,"Naruto Classico", 9.5);
        Manga manga3 = new Manga(4L,"Dragon ball Z",3.2);
        Manga manga4 = new Manga(3L,"Não conheço outros",11.20);
        Manga manga5 = new Manga(2L,"Pokemon",50.05);

        Map<Consumidor, Manga> map = new HashMap<>();
        map.put(consumidor1, manga3);
        map.put(consumidor2, manga2);
        for (Map.Entry<Consumidor, Manga> entry : map.entrySet()){
            System.out.println(entry.getKey().getNome()+": "+entry.getValue().getNome());
        }
    }
}
