package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
//        Funcionario funcionario = new Funcionario("Rubi", 5000);
//        System.out.println(funcionario);
        Gerente gerente = new Gerente("Sabrina", 10000);
        Desenvolvedor dev = new Desenvolvedor("Filipe", 12000);
        System.out.println(gerente);
        System.out.println(dev);
        gerente.imprime();
        dev.imprime();

    }
}
