package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        nomes.add("Filipe");
        nomes.add("Devdojo");

        for (Object nome : nomes){
            System.out.println(nome);
        }

        nomes.add("Teste");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
