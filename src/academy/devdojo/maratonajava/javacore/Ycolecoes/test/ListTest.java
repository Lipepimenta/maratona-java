package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Filipe");
        nomes.add("Devdojo");
        nomes2.add("Filipe2");
        nomes2.add("Devdojo2");

        nomes.addAll(nomes2);

        System.out.println(nomes.remove("filipe"));

        for (Object nome : nomes){
            System.out.println(nome);
        }

        nomes.add("Teste");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
