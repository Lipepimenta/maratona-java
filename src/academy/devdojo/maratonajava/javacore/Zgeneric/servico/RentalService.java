package academy.devdojo.maratonajava.javacore.Zgeneric.servico;

import academy.devdojo.maratonajava.javacore.Zgeneric.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponiveis(){
        System.out.println("Buscando objeto disponíveis...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Aluga objeto: "+t);
        System.out.println("Objeto disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornaObjetoAlugado(T t){
        System.out.println("Devolvendo carro "+t);
        objetosDisponiveis.add(t);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
