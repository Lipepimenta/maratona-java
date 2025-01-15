package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calculaImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto sobre o computador");
        double imposto = computador.CALCULAR_IMPOSTO();
        System.out.println("Nome do produto: "+computador.getNome());
        System.out.println("Valor do produto: "+computador.getValor());
        System.out.println("Imposto do produto: "+imposto);
    }

    public static void calculaImpostoTomate(Tomate tomate){
        System.out.println("Relatório deimposto sobre o tomate");
        double impostoTomate = tomate.CALCULAR_IMPOSTO();
        System.out.println("Nome do produto: "+tomate.getNome());
        System.out.println("Valor do produto: "+tomate.getValor());
        System.out.println("Imposto do produto: "+impostoTomate);
    }
}
