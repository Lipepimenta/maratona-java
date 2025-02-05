package academy.devdojo.maratonajava.javacore.Zgeneric.test;

import academy.devdojo.maratonajava.javacore.Zgeneric.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgeneric.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgeneric.servico.BarcoRentavelServico;
import academy.devdojo.maratonajava.javacore.Zgeneric.servico.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("BMW"), new Barco("Fusca")));
        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponiveis();
        System.out.println("Usando o carro por um mês...");
        rentalService.retornaObjetoAlugado(carro);

        System.out.println("-----------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponiveis();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornaObjetoAlugado(barco);
    }
}
