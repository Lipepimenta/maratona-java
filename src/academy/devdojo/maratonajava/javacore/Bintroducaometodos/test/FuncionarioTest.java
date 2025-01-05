package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

import java.math.BigDecimal;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.nome = "Filipe";
        funcionario1.idade = 24;
        funcionario1.salario = new BigDecimal("5000.00");

        funcionario2.nome = "Sabrina";
        funcionario2.idade = 24;
        funcionario2.salario = new BigDecimal("6500.00");

        funcionario3.nome = "Samuel";
        funcionario3.idade = 27;
        funcionario3.salario = new BigDecimal("10000.00");

        funcionario1.impressaoDados();
        funcionario2.impressaoDados();
        funcionario3.impressaoDados();

        Funcionario[] funcionario = {funcionario1, funcionario2, funcionario3};
        funcionario1.mediaSalarial(funcionario);
    }
}
