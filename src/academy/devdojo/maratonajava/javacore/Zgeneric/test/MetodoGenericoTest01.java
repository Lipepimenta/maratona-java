package academy.devdojo.maratonajava.javacore.Zgeneric.test;

import academy.devdojo.maratonajava.javacore.Zgeneric.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcosList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcosList);
    }
    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
}
