package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 9", 5000);

        Tomate tomate = new Tomate("Rodelas", 5);
        tomate.setDataValidade("31/01/2025");
        CalculadoraImposto.calculaImposto(tomate);
        System.out.println("--------------------");
        CalculadoraImposto.calculaImposto(produto1);
    }
}
