package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneLisTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC2", "Pixel");
        Smartphone s3 = new Smartphone("1ABC3", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smart : smartphones){
            System.out.println(smart);
        }

        Smartphone s4 = new Smartphone("1ABC2", "Pixel");

        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
