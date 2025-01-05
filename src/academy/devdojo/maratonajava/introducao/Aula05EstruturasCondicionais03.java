package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 600;
        String mensagemDoar = "Eu vou doar 500 pro Dev";
        String mensagemNaoDOar = "Eu não tenho condições";
        String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDOar;
        System.out.println(resultado);
    }
}
