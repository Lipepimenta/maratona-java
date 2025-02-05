package academy.devdojo.maratonajava.javacore.Zgeneric.servico;

import academy.devdojo.maratonajava.javacore.Zgeneric.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelServico {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("BMW"), new Barco("Fusca")));

    public Barco buscarBarcoDisponiveis(){
        System.out.println("Buscando barcos disponíveis...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Barco alugado: "+barco);
        System.out.println("barcos disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornaBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco "+barco);
        barcosDisponiveis.add(barco);
        System.out.println("barcos disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
