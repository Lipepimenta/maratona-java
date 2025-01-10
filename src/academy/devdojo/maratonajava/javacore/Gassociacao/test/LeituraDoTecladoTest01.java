package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = entrada.next().charAt(0); //transforme a string em um array, cada letra é uma posição, pegue a posição 0.
        System.out.println("---------------");
        System.out.println("Seu nome é, " +nome+" você tem " +idade+" anos e seu sexo é, "+sexo);
    }
}
