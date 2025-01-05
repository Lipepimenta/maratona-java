package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 30000;
        double primeraFaixa = 9.70 / 100;
        double segundaaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712){
            valorImposto = salarioAnual *= primeraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual *= segundaaFaixa;
        } else {
            valorImposto = salarioAnual *= terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
