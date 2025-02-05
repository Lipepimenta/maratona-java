package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangasQueue = new PriorityQueue<>(new MangasPorPreco().reversed());
        mangasQueue.add(new Manga(5L,"Naruto Shipudden",19.9));
        mangasQueue.add(new Manga(1L,"Naruto Classico", 9.5));
        mangasQueue.add(new Manga(4L,"Dragon ball Z",3.2));
        mangasQueue.add(new Manga(3L,"Não conheço outros",11.20));
        mangasQueue.add(new Manga(2L,"Pokemon",50.05));

        while (!mangasQueue.isEmpty()){
            System.out.println(mangasQueue.poll());
        }
    }
}
