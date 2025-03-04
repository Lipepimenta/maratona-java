package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    public static final double VALOR_IMPOSTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CALCULAR_IMPOSTO() {
        System.out.println("Calculando imposto do computador");
        return this.valor * VALOR_IMPOSTO;
    }

}
