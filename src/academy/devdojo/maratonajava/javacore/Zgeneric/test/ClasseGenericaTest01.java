package academy.devdojo.maratonajava.javacore.Zgeneric.test;

import academy.devdojo.maratonajava.javacore.Zgeneric.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgeneric.servico.CarroRentavelServico;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelServico carroRentavelServico = new CarroRentavelServico();
        Carro carro = carroRentavelServico.buscarCarroDisponiveis();
        System.out.println("Usando o carro por um mês...");
        carroRentavelServico.retornaCarroAlugado(carro);
    }
}
