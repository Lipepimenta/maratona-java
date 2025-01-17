package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calculaImposto(Produto produto){
        System.out.println("Relatório de impostos sobre produtos");
        double imposto = produto.CALCULAR_IMPOSTO();
        System.out.println("Nome do produto: "+produto.getNome());
        System.out.println("Valor do produto: "+produto.getValor());
        System.out.println("Imposto do produto: "+imposto);
        if (produto instanceof Tomate){
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Validade do produto: "+dataValidade);
        }
    }
}
