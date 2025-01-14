package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco estatico de Funcionario");
    }

    {
        System.out.println("Bloco de inicialização dentro de Funcionario 01");
    }

    {
        System.out.println("Bloco de inicialização dentro de Funcionario 02");
    }

    public Funcionario(String nome){
        super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario herdado: "+this.salario);
    }

    public void imprime2(){
        System.out.println("Eu "+this.nome+" recebo um salario de: "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
