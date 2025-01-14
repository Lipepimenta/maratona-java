package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua dos bobos, n°0");
        endereco.setCep(123456789);
        Pessoa pessoa = new Pessoa("Filipe Smith");
        pessoa.setCpf("1235454");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Filipe Pimenta");
        System.out.println("---------------");
        funcionario.setCpf("123456789");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();

        funcionario.imprime2();
    }
}
