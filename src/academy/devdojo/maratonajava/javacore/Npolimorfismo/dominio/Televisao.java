package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    public static final double VALOR_IMPOSTO = 0.2;

    @Override
    public double CALCULAR_IMPOSTO() {
        System.out.println("Calculando imposto da televisão");
        return this.valor * VALOR_IMPOSTO;
    }
}
