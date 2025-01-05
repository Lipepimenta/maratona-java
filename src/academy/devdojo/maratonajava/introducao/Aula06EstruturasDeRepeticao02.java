package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100000; i+=2){
            if (i % 2 == 0) {
                System.out.println("N° "+i);
            }
        }
    }
}
