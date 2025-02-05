package academy.devdojo.maratonajava.javacore.Zgeneric.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("teste02");

        for (String o : lista){
            System.out.println(o);
        }
        add(lista, new Consumidor("Midoriya"));

        for (Object o : lista){
            System.out.println(o);
        }
    }
    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
