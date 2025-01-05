package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro02 = new Carro();

        carro.nome = "Onix";
        carro.modelo = "Hatch";
        carro.ano = 2020;

        carro02.nome = "Logan";
        carro02.modelo = "Sedan";
        carro02.ano = 2014;

        carro = carro02;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
        System.out.println("-------------------");
        System.out.println(carro02.nome);
        System.out.println(carro02.modelo);
        System.out.println(carro02.ano);

    }
}
