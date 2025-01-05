package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario02;

public class FuncionarioTest02 {
    public static void main(String[] args) {
        Funcionario02 funcionario02 = new Funcionario02();

        funcionario02.setNome("Salsicha");
        funcionario02.setIdade(28);
        funcionario02.setSalarios(new double[]{2000, 1500.90, 3000});

        funcionario02.imprime();
        System.out.println("Imprime média" + funcionario02.getMedia());
    }
}
