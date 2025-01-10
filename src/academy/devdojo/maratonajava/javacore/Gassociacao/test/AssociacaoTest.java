package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno1 = new Aluno("Filipe Pimenta", 24);
        Aluno aluno2 = new Aluno("Sabrina Gregorio", 24);
        Aluno[] alunosDisponiveis = {aluno1, aluno2};

        Professor professor1 = new Professor("Tio Patinhas", "Riqueza");
        Professor professor2= new Professor("Guanabara", "Tecnologia");
        Seminario seminario1 = new Seminario("Como ser Feliz", alunosDisponiveis, local);
        Seminario seminario2 = new Seminario("A simplicidade da Visa", alunosDisponiveis, local);

        Seminario[] seminariosProfessor1 = {seminario1};
        Seminario[] seminariosProfessor2 = {seminario2};

        professor1.setSeminarios(seminariosProfessor1);
        professor2.setSeminarios(seminariosProfessor2);
        professor1.imprime();
        professor2.imprime();
    }
}
