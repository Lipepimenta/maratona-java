package academy.devdojo.maratonajava.javacore.Zgeneric.test;

import academy.devdojo.maratonajava.javacore.Zgeneric.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgeneric.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgeneric.servico.BarcoRentavelServico;
import academy.devdojo.maratonajava.javacore.Zgeneric.servico.CarroRentavelServico;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelServico barcoRentavelServico = new BarcoRentavelServico();
        Barco barco = barcoRentavelServico.buscarBarcoDisponiveis();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelServico.retornaBarcoAlugado(barco);
    }
}
