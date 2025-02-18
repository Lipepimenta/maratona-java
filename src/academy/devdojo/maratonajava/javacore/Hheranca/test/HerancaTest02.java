package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialiazação estático da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialiazação estático da subclasse é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço em memória pro objeto da superclasse pai
    // 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado da classe pai
    // 4 - Bloco incializado da superclasse é executado na ordem que aparecer
    // 5 - Construtor é executado da superclasse
    // 6 - Alocado espaço memória pro objeto da subclasse
    // 7 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado da classe pai
    // 8 - Bloco incializado da superclasse é executado na ordem que aparecer
    // 9 - Construtor é executado da superclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
