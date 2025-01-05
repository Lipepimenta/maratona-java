package academy.devdojo.maratonajava.introducao;

import java.time.LocalDate;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Filipe";
        String endereco = "R.Atalia, n XX";
        double salario = 10000;
        LocalDate dataRecebimentoSalario = LocalDate.now();

        System.out.println("Eu "+nome+", morando no endereço "+endereco+" confirmo que recebi o solário de "+salario+", na data "+dataRecebimentoSalario);
    }
}
