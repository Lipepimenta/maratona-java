package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.math.BigDecimal;
import java.util.Arrays;

public class Funcionario {
    public String nome;
    public int idade;
    public BigDecimal salario;

    public void impressaoDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
        System.out.println("------------------");
    }

    public void mediaSalarial(Funcionario[] funcionarios){
        if (funcionarios == null || funcionarios.length == 0){
            System.out.println("Nenhum funcionário encontrado");
            return;
        }
        BigDecimal soma = Arrays.stream(funcionarios)
                .map(func -> func.salario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal media = soma.divide(new BigDecimal(funcionarios.length), BigDecimal.ROUND_HALF_UP);
        System.out.println("Média salarial: " +media);
    }
}
