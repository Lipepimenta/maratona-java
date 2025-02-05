package academy.devdojo.maratonajava.javacore.Zgeneric.servico;

import academy.devdojo.maratonajava.javacore.Zgeneric.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelServico {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro buscarCarroDisponiveis(){
        System.out.println("Buscando carros disponíveis...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Carro alugado: "+carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornaCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro "+carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}
