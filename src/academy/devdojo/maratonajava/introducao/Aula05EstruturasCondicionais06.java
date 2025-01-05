package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7  imprima se é dia ultil ou final de semana, considerando dia 1 como domingo
        int dia = 1;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
            default:
                System.out.println("Opção invalida");
        }
    }
}
