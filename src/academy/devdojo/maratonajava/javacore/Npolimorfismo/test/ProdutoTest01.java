package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Italiano", 15);
        Televisao TV = new Televisao("Samsung 70",5000);
        CalculadoraImposto.calculaImposto(computador);
        System.out.println("------------------------");
        CalculadoraImposto.calculaImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calculaImposto(TV);
    }
}
